package com.demo2;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublisher;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class HTTPClientPOSTRequest {

	public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
		
		HttpClient client = HttpClient.newHttpClient(); // Responsible for Executing API Request 
		
		// Resquest Body
		String jsonBody = "{\r\n"
						+ "    \"username\": \"iamfd\", \r\n"
						+ "    \"password\": \"password\"\r\n"
						+ "}";
		BodyPublisher requestBody = BodyPublishers.ofString(jsonBody);
		
		HttpRequest request = HttpRequest.newBuilder()
				.uri(new URI("http://64.227.160.186:9000/v1/login"))
				.POST(requestBody)
				.header("Content-type", "application/json")
				.build();
		
		HttpResponse<String> response = client.send(request, BodyHandlers.ofString()); // Body Handler tells the Response should be String
		System.out.println(response.statusCode());
		System.out.println(response.body());
	}

}
