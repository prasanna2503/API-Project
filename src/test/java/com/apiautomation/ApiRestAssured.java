package com.apiautomation;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ApiRestAssured {
	RequestSpecification reqSpec;
	
	public static void main(String[] args) {
		ApiRestAssured rest = new ApiRestAssured();
		//rest.createFlight();
		//rest.updateFlight();
		//rest.getFlight();
		//rest.deleteFlight();
		rest.patchFlight();
	}
	
	public void createFlight() {
		//1.Initialize the Rest Assured Class
		
		
		
		 reqSpec = RestAssured.given();
		 
		 //2.Pass the Header name , Body(Req Body,Payload),Auth
		 
		 reqSpec = reqSpec.header("Content-Type","application/json");
		 
		 //3/payload , Req Body
		 
		 reqSpec = reqSpec.body("{\r\n"
		 		+ "    \"flightName\": \"AirIndia\",\r\n"
		 		+ "    \"Country\": \"India\",\r\n"
		 		+ "    \"Destinations\": \"87\",\r\n"
		 		+ "    \"URL\": \"https:\\/\\/en.wikipedia.org\\/wiki\\/Air_India\"\r\n"
		 		+ "}");
		 
		 //4.req Type , End Point
		 Response response = reqSpec.post("https://www.omrbranch.com/api/flights");
		 
		 //to get Status Code
		 
		 int statusCode = response.getStatusCode();
		 System.out.println(statusCode);
		 
		 // to get Response Body ----> AsString
		 String asString = response.asString();
		 System.out.println(asString);
		 
		 //to get Response Body---->AsPrettyString
		 
		 String asPrettyString = response.asPrettyString();
		 System.out.println(asPrettyString);
	}
	
	public void updateFlight() {
		reqSpec = RestAssured.given();
		
		reqSpec = reqSpec.header("Content-Type","application/json");
		
		reqSpec = reqSpec.body("{\r\n"
				+ "    \"flightName\": \"Prasanna Air Lines\",\r\n"
				+ "    \"Country\": \"Bharath\",\r\n"
				+ "    \"Destinations\": 1007,\r\n"
				+ "    \"URL\": \"https:\\/\\/en.wikipedia.org\\/wiki\\/Prasanna_Air_Lines\"\r\n"
				+ "}");
		Response response = reqSpec.put("https://www.omrbranch.com/api/flight/34372");
		
		int statusCode = response.getStatusCode();
		System.out.println("Update Flight Status Code :" + statusCode);
		
		String asString = response.asString();
		System.out.println(asString);
		
		String asPrettyString = response.asPrettyString();
		System.out.println("Update Flight Payload :" + asPrettyString);
	}
	
	public void getFlight() {
		reqSpec = RestAssured.given();
		
		reqSpec = reqSpec.header("Content-Type","application/json");
		Response response = reqSpec.get("https://www.omrbranch.com/api/flight/34372");
		int statusCode = response.getStatusCode();
		System.out.println("Get Flight Response Code :" + statusCode);
		String getFlightBody = response.asPrettyString();
		System.out.println(getFlightBody);
	}
	
	public void deleteFlight() {
		reqSpec = RestAssured.given();
		
		reqSpec = reqSpec.header("Content-Type","application/json");
		Response delete = reqSpec.delete("https://www.omrbranch.com/api/flight/34372");
		int statusCode = delete.getStatusCode();
		System.out.println(statusCode);
		
	}
	
	public void patchFlight() {
		reqSpec = RestAssured.given();
		reqSpec = reqSpec.header("Content-Type","application/json");
		reqSpec.body("{\r\n"
				+ "    \"flightName\": \\\"Prasanna Air Lines\\\"\r\n"
				+ "}");
		Response response = reqSpec.patch("https://www.omrbranch.com/api/flight/34526");
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		String asPrettyString = response.asPrettyString();
		System.out.println(asPrettyString);
	}
}
