package com.counter;

import java.util.HashMap;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class CounterResponse {
	private HashMap<String,Integer> counts;
	private String topCounts;
	
	public HashMap<String, Integer> getCounts() {
		return counts;
	}

	public void setCounts(HashMap<String, Integer> counts) {
		this.counts = counts;
	}

	public String getTopCounts() {
		return topCounts;
	}

	public void setTopCounts(String topCounts) {
		this.topCounts = topCounts;
	}

	@Override
	public String toString() {
		return "CounterResponse [wordCount=" + counts + ", topCounts=" + topCounts + "]";
	}
	
}
