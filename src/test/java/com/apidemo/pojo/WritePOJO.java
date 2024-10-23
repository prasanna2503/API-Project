package com.apidemo.pojo;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WritePOJO {
	private int page;
	private int per_page;
	private long total;
	private long total_pages;
	private ArrayList<DataW> data;
	private Support support;
}
