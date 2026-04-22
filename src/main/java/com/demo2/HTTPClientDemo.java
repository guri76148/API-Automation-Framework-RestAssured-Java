package com.demo2;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class HTTPClientDemo {

	public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
		
		HttpClient client = HttpClient.newHttpClient(); // Responsible for Executing API Request 
		
		HttpRequest request = HttpRequest.newBuilder()
				.uri(new URI("http://www.google.com"))
				.GET()
				.header("Accept", "*/*")
				.build();
		
		HttpResponse<String> response = client.send(request, BodyHandlers.ofString()); // Body Handler tells the Response should be String
		System.out.println(response.statusCode());
		System.out.println(response.body());
	}

}
