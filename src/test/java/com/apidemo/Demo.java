package com.apidemo;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Demo {
	public static void main(String[] args) throws IOException, ParseException {
		//Create the Object for JSONParse
		JSONParser  jsonParser = new JSONParser();
		//Pass the json file to fetch values
		Object parse = jsonParser.parse(new FileReader(System.getProperty("user.dir")  + "\\src\\test\\resources\\Demo.json"));
		
		JSONObject jsonObject = (JSONObject) parse;
		Object object = jsonObject.get("data");
		
		JSONObject jsonObject1 = (JSONObject) object;
		Object id = jsonObject1.get("id");
		System.out.println("Id :"+ id);
		
		Object object3 = jsonObject1.get("flightName");
		System.out.println("flightName :"+ object3);
		
		Object country = jsonObject1.get("Country");
		System.out.println("Country :"+ country);
		
		Object destinations = jsonObject1.get("Destinations");
		System.out.println("Destinations :"+ destinations);
		
		Object url = jsonObject1.get("URL");
		System.out.println("URL"+ url);
		
		Object createdDate = jsonObject1.get("Created_Date");
		System.out.println("Created_Date :"+ createdDate);
		
		Object updatedDate = jsonObject1.get("Updated_Date");
		System.out.println("Updated_Date :"+ updatedDate);
		
		
		
		Object object4 = jsonObject.get("support");
		JSONObject jsonObject2 = (JSONObject) object4;
		Object url1 = jsonObject2.get("url");
		System.out.println("url:" + url1);
		Object text = jsonObject2.get("text");
		System.out.println("text:" + text);
	}
}
