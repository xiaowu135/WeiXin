package com.xiaowu;

import java.io.IOException;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.methods.GetMethod;

public class HttpClientDemo {
	public static void main(String[] args) throws HttpException, IOException {
		HttpClient httpClient = new HttpClient();
        
        String uri = "http://www.google.com";
        HttpMethod method = new GetMethod(uri);
        httpClient.executeMethod(method );
        
        //服务器返回状态
        print(method.getStatusLine());
        //返回的内容
        print(method.getResponseBodyAsString());
        //释放连接
        method.releaseConnection();
	}
	
	
	 static void print(Object o) {
	        System.out.println("测试数据:"+o);
	    }
}
