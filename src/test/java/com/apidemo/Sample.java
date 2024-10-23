package com.apidemo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Sample {
	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		JSONParser jsonParser = new JSONParser();
		Object parse = jsonParser.parse(new FileReader(System.getProperty("user.dir") + "\\src\\test\\resources\\Sample.json"));
		
		JSONObject jsonObject = (JSONObject) parse;
		Object page = jsonObject.get("page");
		System.out.println(page);
		
		Object perPage = jsonObject.get("per_page");
		System.out.println(perPage);
		
		Object total = jsonObject.get("total");
		System.out.println(total);
		
		Object totalPages = jsonObject.get("total_pages");
		System.out.println(totalPages);
		
		Object data = jsonObject.get("data");
		System.out.println(data);
		
		JSONArray array = (JSONArray) data;
		for (int i = 0; i < array.size(); i++) {
			Object object = array.get(i);
			JSONObject jsonObject2 = (JSONObject) object;
			Object id = jsonObject2.get("id");
			System.out.println(id);
			Object flight = jsonObject2.get("flightName");
			System.out.println(flight);
			Object country = jsonObject2.get("Country");
			System.out.println(country);
			Object desig = jsonObject2.get("Destinations");
			System.out.println(desig);
			Object url = jsonObject2.get("URL");
			System.out.println(url);
		}
		Object support = jsonObject.get("support");
		JSONObject jsonObject2 = (JSONObject) support;
		Object url2 = jsonObject2.get("url");
		System.out.println(url2);
		Object text = jsonObject2.get("text");
		System.out.println(text);
	}
}
