package com.restassured.demo;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class LoginAPIRequest {

	public static void main(String[] args) {
		
		RestAssured.baseURI = "http://64.227.160.186:9000/v1";
		
		RequestSpecification request = RestAssured.given();
		RequestSpecification request2 = request.header("Content-Type", "application/json");
		RequestSpecification request3 = request2.body("{\r\n"
				+ "    \"username\": \"iamfd\", \r\n"
				+ "    \"password\": \"password\"\r\n"
				+ "}");
		Response response = request3.post("login");
		
		System.out.println(response.asPrettyString());
		System.out.println(response.statusCode());
		System.out.println(response.time());
		
	}

}
