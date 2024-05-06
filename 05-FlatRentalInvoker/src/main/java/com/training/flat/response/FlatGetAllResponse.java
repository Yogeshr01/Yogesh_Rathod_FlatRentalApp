package com.training.flat.response;

import java.util.List;

import com.training.bean.Flat;

public class FlatGetAllResponse {

	private int statusCode;
	private String message;
	private List<Flat> allFlats;
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public List<Flat> getAllFlats() {
		return allFlats;
	}
	public void setAllFlats(List<Flat> allFlats) {
		this.allFlats = allFlats;
	}
	
}