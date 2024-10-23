package com.apiautomation;

import org.testng.annotations.Test;

import com.api.baseclass.BaseClass;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Sample extends BaseClass {
	Object object;
	@Test(priority = 1)
	public void createFlight() {
		addHeader("Content-Type", "application/json");
		addBody("{\r\n"
				+ "    \"flightName\": \"Lovely Air Lines\",\r\n"
				+ "    \"Country\": \"India\",\r\n"
				+ "    \"Destinations\": \"0612\",\r\n"
				+ "    \"URL\": \"https:\\/\\/EliteAirLines.com\\/wiki\\/Elite_AirLines\"\r\n"
				+ "}");
		Response res = addReqType("POST", "https://www.omrbranch.com/api/flights");
		int statusCode = getStatusCode(res);
		System.out.println(statusCode);
		JsonPath jsonPath = res.jsonPath();
		object = jsonPath.get("data.id");
		String body = getResBodyAsPrettyString(res);
		System.out.println(body);
	}
	
	@Test(priority = 2)
	public void singleFlight() {
		addHeader("Content-Type", "application/json");
		Response response = addReqType("GET", "https://www.omrbranch.com/api/flight/"+ object +"");
		int statusCode = getStatusCode(response);
		System.out.println(statusCode);
		String body = getResBodyAsPrettyString(response);
		System.out.println(body);
	}
	
	@Test(priority = 3)
	public void updateFlight() {
		addHeader("Content-Type", "application/json");
		addBody("{\r\n"
				+ "    \"flightName\": \"Beluga\",\r\n"
				+ "    \"Country\": \"USA\",\r\n"
				+ "    \"Destinations\": 201,\r\n"
				+ "    \"URL\": \"https:\\/\\/www.beluga.com\\/wiki\\/Beluga\"\r\n"
				+ "}");
		Response response = addReqType("PUT", "https://www.omrbranch.com/api/flight/"+ object +"");
		int statusCode = getStatusCode(response);
		System.out.println(statusCode);
		String body = getResBodyAsPrettyString(response);
		System.out.println(body);
	}
	
	@Test(priority = 4)
	public void updateFlightPatch() {
		addHeader("Content-Type", "application/json");
		addBody("{\r\n"
				+ "    \"Country\": \"Russia\"\r\n"
				+ "}");
		Response response = addReqType("PATCH", "https://www.omrbranch.com/api/flight/"+ object +"");
		int statusCode = getStatusCode(response);
		System.out.println(statusCode);
		String body = getResBodyAsPrettyString(response);
		System.out.println(body);
	}
	
	@Test(priority = 5)
	public void deleteFlight() {
		addHeader("Contet-Type", "application/json");
		Response response = addReqType("DELETE", "https://www.omrbranch.com/api/flight/"+ object +"");
		int statusCode = getStatusCode(response);
		System.out.println(statusCode);
	}
	
	@Test(priority = 6)
	public void listFlights() {
		addHeader("Content-Type", "application/json");
		Response response = addReqType("GET", "https://www.omrbranch.com/api/flights?page=1630");
		int statusCode = getStatusCode(response);
		System.out.println(statusCode);
		String body = getResBodyAsPrettyString(response);
		System.out.println(body);
	}
}
