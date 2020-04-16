/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.olingo2.springboot;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.component.olingo2.internal.Olingo2ApiName;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.apache.camel.util.jsse.SSLContextParameters;
import org.apache.http.HttpHost;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.nio.client.HttpAsyncClientBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Communicates with OData 2.0 services using Apache Olingo.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.olingo2")
public class Olingo2ComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the olingo2 component. This is
     * enabled by default.
     */
    private Boolean enabled;
    /**
     * To use the shared configuration
     */
    private Olingo2ConfigurationNestedConfiguration configuration;
    /**
     * Enable usage of global SSL context parameters.
     */
    private Boolean useGlobalSslContextParameters = false;
    /**
     * Whether the component should resolve property placeholders on itself when
     * starting. Only properties which are of String type can use property
     * placeholders.
     */
    private Boolean resolvePropertyPlaceholders = true;

    public Olingo2ConfigurationNestedConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(
            Olingo2ConfigurationNestedConfiguration configuration) {
        this.configuration = configuration;
    }

    public Boolean getUseGlobalSslContextParameters() {
        return useGlobalSslContextParameters;
    }

    public void setUseGlobalSslContextParameters(
            Boolean useGlobalSslContextParameters) {
        this.useGlobalSslContextParameters = useGlobalSslContextParameters;
    }

    public Boolean getResolvePropertyPlaceholders() {
        return resolvePropertyPlaceholders;
    }

    public void setResolvePropertyPlaceholders(
            Boolean resolvePropertyPlaceholders) {
        this.resolvePropertyPlaceholders = resolvePropertyPlaceholders;
    }

    public static class Olingo2ConfigurationNestedConfiguration {
        public static final Class CAMEL_NESTED_CLASS = org.apache.camel.component.olingo2.Olingo2Configuration.class;
        /**
         * What kind of operation to perform
         */
        private Olingo2ApiName apiName;
        /**
         * What sub operation to use for the selected operation
         */
        private String methodName;
        /**
         * Target OData service base URI, e.g.
         * http://services.odata.org/OData/OData.svc
         */
        private String serviceUri;
        /**
         * Content-Type header value can be used to specify JSON or XML message
         * format, defaults to application/json;charset=utf-8
         */
        private String contentType = "application/json;charset=utf-8";
        /**
         * Custom HTTP headers to inject into every request, this could include
         * OAuth tokens, etc.
         */
        private Map httpHeaders;
        /**
         * HTTP connection creation timeout in milliseconds, defaults to 30,000
         * (30 seconds)
         */
        private Integer connectTimeout = 30000;
        /**
         * HTTP request timeout in milliseconds, defaults to 30,000 (30 seconds)
         */
        private Integer socketTimeout = 30000;
        /**
         * HTTP proxy server configuration
         */
        private HttpHost proxy;
        /**
         * To configure security using SSLContextParameters
         */
        private SSLContextParameters sslContextParameters;
        /**
         * Custom HTTP async client builder for more complex HTTP client
         * configuration, overrides connectionTimeout, socketTimeout, proxy and
         * sslContext. Note that a socketTimeout MUST be specified in the
         * builder, otherwise OData requests could block indefinitely
         */
        private HttpAsyncClientBuilder httpAsyncClientBuilder;
        /**
         * Custom HTTP client builder for more complex HTTP client
         * configuration, overrides connectionTimeout, socketTimeout, proxy and
         * sslContext. Note that a socketTimeout MUST be specified in the
         * builder, otherwise OData requests could block indefinitely
         */
        private HttpClientBuilder httpClientBuilder;
        /**
         * Set this to true to filter out results that have already been
         * communicated by this component.
         */
        private Boolean filterAlreadySeen = false;

        public Olingo2ApiName getApiName() {
            return apiName;
        }

        public void setApiName(Olingo2ApiName apiName) {
            this.apiName = apiName;
        }

        public String getMethodName() {
            return methodName;
        }

        public void setMethodName(String methodName) {
            this.methodName = methodName;
        }

        public String getServiceUri() {
            return serviceUri;
        }

        public void setServiceUri(String serviceUri) {
            this.serviceUri = serviceUri;
        }

        public String getContentType() {
            return contentType;
        }

        public void setContentType(String contentType) {
            this.contentType = contentType;
        }

        public Map getHttpHeaders() {
            return httpHeaders;
        }

        public void setHttpHeaders(Map httpHeaders) {
            this.httpHeaders = httpHeaders;
        }

        public Integer getConnectTimeout() {
            return connectTimeout;
        }

        public void setConnectTimeout(Integer connectTimeout) {
            this.connectTimeout = connectTimeout;
        }

        public Integer getSocketTimeout() {
            return socketTimeout;
        }

        public void setSocketTimeout(Integer socketTimeout) {
            this.socketTimeout = socketTimeout;
        }

        public HttpHost getProxy() {
            return proxy;
        }

        public void setProxy(HttpHost proxy) {
            this.proxy = proxy;
        }

        public SSLContextParameters getSslContextParameters() {
            return sslContextParameters;
        }

        public void setSslContextParameters(
                SSLContextParameters sslContextParameters) {
            this.sslContextParameters = sslContextParameters;
        }

        public HttpAsyncClientBuilder getHttpAsyncClientBuilder() {
            return httpAsyncClientBuilder;
        }

        public void setHttpAsyncClientBuilder(
                HttpAsyncClientBuilder httpAsyncClientBuilder) {
            this.httpAsyncClientBuilder = httpAsyncClientBuilder;
        }

        public HttpClientBuilder getHttpClientBuilder() {
            return httpClientBuilder;
        }

        public void setHttpClientBuilder(HttpClientBuilder httpClientBuilder) {
            this.httpClientBuilder = httpClientBuilder;
        }

        public Boolean getFilterAlreadySeen() {
            return filterAlreadySeen;
        }

        public void setFilterAlreadySeen(Boolean filterAlreadySeen) {
            this.filterAlreadySeen = filterAlreadySeen;
        }
    }
}