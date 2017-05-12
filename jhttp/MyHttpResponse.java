/*
http response
 */
//package org.apache.http.examples.client;

import java.net.URI;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.HttpResponse;

/**
 * A example that demonstrates how HttpClient APIs can be used to perform
 * form-based logon.
 */
public class MyHttpResponse {

    public static void main(String[] args) throws Exception {
        URI uri = new URIBuilder()
          .setScheme("http")
          .setHost("www.pcom.edu")
          .build();
        HttpGet httpget = new HttpGet(uri);
        System.out.println(httpget.getURI());
        		
        
        HttpClientContext localContext = HttpClientContext.create();
        
    	 CloseableHttpResponse response = httpclient.execute(httpget, localContext);
         System.out.println(response.getStatusLine());
        
        //HttpResponse response = new BasicHttpResponse(HttpVersion.HTTP_1_1,HttpStatus.SC_OK, "OK");
        
        //System.out.println(response.getProtocolVersion());
        //System.out.println(response.getStatusLine().getStatusCode());
        //System.out.println(response.getStatusLine().getReasonPhrase());
        //System.out.println(response.getStatusLine().toString());
        
        

    }
}
