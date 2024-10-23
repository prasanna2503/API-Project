package com.apidemo.pojo;

import java.util.ArrayList;

import lombok.Data;
@Data
public class SamplePOJO {
	private int page;
	private int per_page;
	private int total;
	private int total_pages;
	private ArrayList<DataPOJO> data;
	private SupportPOJO support;
}
