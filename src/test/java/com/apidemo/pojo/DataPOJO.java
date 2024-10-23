package com.apidemo.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class DataPOJO {
	private int id;
	private String flightName;
	    @JsonProperty("Country") 
	    private String country;
	    @JsonProperty("Destinations") 
	    private String destinations;
	    @JsonProperty("URL") 
	    private String uRL;
}
