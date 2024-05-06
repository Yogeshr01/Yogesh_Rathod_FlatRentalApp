package com.training.landlord.response;

import com.training.bean.Landlord;

public class LandlordDeleteResponse {

	private int statusCode;
	private String message;
	private Landlord landlord;
	
	
	public LandlordDeleteResponse() {
		super();
		this.landlord = landlord;
	}
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
	public Landlord getLandlord() {
		return landlord;
	}
	public void setLandlord(Landlord landlord) {
		this.landlord = landlord;
	}
}