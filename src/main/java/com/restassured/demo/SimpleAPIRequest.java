package com.restassured.demo;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SimpleAPIRequest {

	public static void main(String[] args) {
		
		//Base URL https://www.google.com
		//Endpoint NA
		//HTTP Verb GET
		//HEADER Accept */*
		//BODY XX

		RestAssured.baseURI = "https://www.google.com";
		
		// Request Specification: Interface --> allows us to config various imp information for the request
		//endpoint, base url, http verb, headers, payload(body)
		
		RequestSpecification request = RestAssured.given();
		RequestSpecification request2 = request.header("Accept", "*/*");
		Response response = request2.get();
		
		System.out.println(response.asPrettyString());
		System.out.println(response.statusCode());
		System.out.println(response.time());
	}

}
