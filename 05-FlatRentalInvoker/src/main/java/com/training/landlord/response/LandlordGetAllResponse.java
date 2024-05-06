package com.training.landlord.response;

import java.util.List;

import com.training.bean.Landlord;

public class LandlordGetAllResponse {

	private int statusCode;
	private String message;
	private List<Landlord> getAllLandlord;
	
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
	public List<Landlord> getGetAllLandlord() {
		return getAllLandlord;
	}
	public void setGetAllLandlord(List<Landlord> getAllLandlord) {
		this.getAllLandlord = getAllLandlord;
	}
	
}