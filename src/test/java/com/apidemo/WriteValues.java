package com.apidemo;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.apidemo.pojo.DataW;
import com.apidemo.pojo.Support;
import com.apidemo.pojo.WritePOJO;
import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class WriteValues {
	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		
		//Assign Values
		ArrayList<DataW> a = new ArrayList<DataW>();
		DataW d1 = new DataW(3, "AirIndia", "India", "28", "https:\\/\\/en.wikipedia.org\\/wiki\\/Air_India");
		DataW d2 = new DataW(33, "AirIndia", "India", "20", "https:\\/\\/en.wikipedia.org\\/wiki\\/Air_India");
		DataW d3 = new DataW(36, "AirIndia", "India", "71", "https:\\/\\/en.wikipedia.org\\/wiki\\/Air_India");
		DataW d4 = new DataW(42, "AirIndia", "India", "98", "https:\\/\\/en.wikipedia.org\\/wiki\\/Air_India");
		DataW d5 = new DataW(49, "AirIndia", "India", "88", "https:\\/\\/en.wikipedia.org\\/wiki\\/Air_India");
		DataW d6 = new DataW(59, "AirIndia", "India", "87", "https:\\/\\/en.wikipedia.org\\/wiki\\/Air_India");
		a.add(d1);
		a.add(d2);
		a.add(d3);
		a.add(d4);
		a.add(d5);
		a.add(d6);
		Support s = new Support("https:\\/\\/omrbranch.com", "For Joining Automation Course, Please Contact-Velmurugan 9944152058");
		WritePOJO writePOJO = new WritePOJO(1, 6, 9118, 1250, a, s);
		mapper.writeValue(new File(System.getProperty("user.dir") + "\\src\\test\\resources\\Write.json"), writePOJO);
		
	}
}

