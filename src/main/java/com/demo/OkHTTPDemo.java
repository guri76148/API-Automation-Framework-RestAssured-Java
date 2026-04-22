package com.demo;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class OkHTTPDemo {

	public static void main(String[] args) throws IOException {
		OkHttpClient client = new OkHttpClient();
		
		// Request --> GET
		
		Request request = new Request.Builder().url("https://www.google.com").get().header("Accept", "*/*").build();
		
		Response response = client.newCall(request).execute();
		System.out.println(response.code());
		System.out.println(response.body().string());

	}

}
