package com.apidemo;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.apidemo.pojo.DataPOJO;
import com.apidemo.pojo.SamplePOJO;
import com.apidemo.pojo.SupportPOJO;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Employee {
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		SamplePOJO v = mapper.readValue(new File(System.getProperty("user.dir") + "\\src\\test\\resources\\Sample.json"), SamplePOJO.class);
		
		int page = v.getPage();
		System.out.println(page);
		int per_page = v.getPer_page();
		System.out.println(per_page);
		int total = v.getTotal();
		System.out.println(total);
		int total_pages = v.getTotal_pages();
		System.out.println(total_pages);
		
		ArrayList<DataPOJO> data = v.getData();
		
		for (DataPOJO d : data) {
			int id = d.getId();
			System.out.println(id);
			String flightName = d.getFlightName();
			System.out.println(flightName);
			String country = d.getCountry();
			System.out.println(country);
			String destinations = d.getDestinations();
			System.out.println(destinations);
			String url = d.getURL();
			System.out.println(url);
			
		}
		
		SupportPOJO s = v.getSupport();
		String url = s.getUrl();
		System.out.println(url);
		String text = s.getText();
		System.out.println(text);
	}
}
