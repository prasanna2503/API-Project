package com.apidemo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DataW {
	private int id;
	private String flightName;
	private String country;
	private String destinations;
	private String uRL;
}
