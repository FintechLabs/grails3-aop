package com.webhooks

import org.apache.commons.httpclient.HttpClient
import org.apache.commons.httpclient.HttpConnectionManager
import org.apache.commons.httpclient.MultiThreadedHttpConnectionManager
import org.apache.commons.httpclient.methods.PostMethod

class HttpClientImpl {

    HttpClient client = null

    HttpClientImpl() {
        HttpConnectionManager httpConnectionManager = new MultiThreadedHttpConnectionManager()
        httpConnectionManager.closeIdleConnections(20000)
        this.client = new HttpClient(httpConnectionManager)
    }

    void post(Map<String, String> paramsMap, String urlStr) {
        PostMethod postMethod = null
        try {
            postMethod = new PostMethod(urlStr)
            paramsMap.each { String key, String value ->
                postMethod.addParameter(key, value)
            }
            client.executeMethod(postMethod)
        } catch (Exception e) {
            e.printStackTrace()
        } finally {
            if (postMethod)
                postMethod.releaseConnection()
        }
    }

}
