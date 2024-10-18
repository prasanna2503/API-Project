package com.apidemo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Demo {
	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		//Create the Object for JSONParse
		JSONParser jsonParser = new JSONParser();
		
		//Pass the json file to fetch values
		Object object = jsonParser.parse(new FileReader(System.getProperty("user.dir") + "\\src\\test\\resources\\Sample.json"));
		JSONObject jsonObject = (JSONObject) object;
		Object name = jsonObject.get("name");
		String string = (String) name;
		System.out.println(string);
		
	}
}
