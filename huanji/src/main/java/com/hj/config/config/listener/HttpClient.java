package com.hj.config.config.listener;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.ParseException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@Component
public class HttpClient {
    public static final int SUCCESS = 200;
    CloseableHttpClient httpClient;
    CloseableHttpResponse response;

    private HttpClient() {
        this.httpClient = null;
        this.response = null;
    }

    public static HttpClient getInstance() {
        return HttpClientHolder.instance;
    }

    public String doGet(String uri) {
        HttpGet httpGet = new HttpGet(uri);
        return this.sendHttpGet(httpGet);
    }

    public String doGet(String uri, Map<String, Object> map) {
        List<NameValuePair> parameters = new ArrayList();
        Iterator var4 = map.entrySet().iterator();

        Map.Entry entry;
        while(var4.hasNext()) {
            entry = (Map.Entry)var4.next();
            parameters.add(new BasicNameValuePair((String)entry.getKey(), String.valueOf(entry.getValue())));
        }

        HttpGet httpGet = new HttpGet(uri);
        entry = null;

        try {
            String param = EntityUtils.toString(new UrlEncodedFormEntity(parameters));
            httpGet.setURI((new URIBuilder(httpGet.getURI().toString() + "?" + param)).build());
        } catch (Exception var7) {
            var7.printStackTrace();
        }

        return this.sendHttpGet(httpGet);
    }

    public CloseableHttpResponse doPost(String uri) {
        HttpPost httpPost = new HttpPost(uri);
        return this.sendHttpPost(httpPost);
    }

    public CloseableHttpResponse doPost(String url, Map<String, String> map) {
        HttpPost post = new HttpPost(url);
        List<NameValuePair> pairs = new ArrayList();
        Iterator var5 = map.entrySet().iterator();

        while(var5.hasNext()) {
            Map.Entry<String, String> entry = (Map.Entry)var5.next();
            pairs.add(new BasicNameValuePair((String)entry.getKey(), (String)entry.getValue()));
        }

        try {
            post.setEntity(new UrlEncodedFormEntity(pairs, "UTF-8"));
        } catch (UnsupportedEncodingException var7) {
            var7.printStackTrace();
        }

        return this.sendHttpPost(post);
    }

    public CloseableHttpResponse doPost(String uri, String reqXml) {
        HttpPost httpPost = new HttpPost(uri);
        httpPost.addHeader("Content-Type", "application/xml");
        StringEntity entity = null;

        try {
            entity = new StringEntity(reqXml, "UTF-8");
        } catch (Exception var6) {
            var6.printStackTrace();
        }

        httpPost.setEntity(entity);
        return this.sendHttpPost(httpPost);
    }

    public String doPut(String uri, Map<String, Object> map) {
        List<NameValuePair> parameters = new ArrayList();
        Iterator var4 = map.entrySet().iterator();

        Map.Entry entry;
        while(var4.hasNext()) {
            entry = (Map.Entry)var4.next();
            parameters.add(new BasicNameValuePair((String)entry.getKey(), String.valueOf(entry.getValue())));
        }

        HttpPut httpPut = new HttpPut(uri);
        entry = null;

        try {
            String param = EntityUtils.toString(new UrlEncodedFormEntity(parameters));
            httpPut.setURI((new URIBuilder(httpPut.getURI().toString() + "?" + param)).build());
        } catch (Exception var7) {
            var7.printStackTrace();
        }

        return this.sendHttpPut(httpPut);
    }

    private CloseableHttpResponse sendHttpPost(HttpPost httpPost) {
        try {
            this.httpClient = HttpClients.createDefault();
            this.response = this.httpClient.execute(httpPost);
        } catch (Exception var3) {
            var3.printStackTrace();
        }

        return this.response;
    }

    private String sendHttpGet(HttpGet httpGet) {
        HttpEntity entity = null;
        String responseContent = null;

        try {
            try {
                this.httpClient = HttpClients.createDefault();
                this.response = this.httpClient.execute(httpGet);
                entity = this.response.getEntity();
                responseContent = EntityUtils.toString(entity, "UTF-8");
            } catch (Exception var8) {
                var8.printStackTrace();
            }

            return responseContent;
        } finally {
            ;
        }
    }

    private String sendHttpPut(HttpPut httpPut) {
        HttpEntity entity = null;
        String responseContent = null;

        try {
            this.httpClient = HttpClients.createDefault();
            this.response = this.httpClient.execute(httpPut);
            entity = this.response.getEntity();
            responseContent = EntityUtils.toString(entity, "UTF-8");
        } catch (Exception var5) {
            var5.printStackTrace();
        }

        return responseContent;
    }

    public String getRequestResult(CloseableHttpResponse response) {
        HttpEntity entity = null;
        String responseContent = null;
        int status = response.getStatusLine().getStatusCode();
        if (status == 200) {
            entity = response.getEntity();

            try {
                responseContent = EntityUtils.toString(entity, "UTF-8");
            } catch (IOException | ParseException var14) {
                var14.printStackTrace();
            } finally {
                try {
                    if (response != null) {
                        response.close();
                    }

                    if (this.httpClient != null) {
                        this.httpClient.close();
                    }
                } catch (IOException var13) {
                    var13.printStackTrace();
                }

            }
        }

        return responseContent;
    }

    private static class HttpClientHolder {
        private static HttpClient instance = new HttpClient();

        private HttpClientHolder() {
        }
    }
}
