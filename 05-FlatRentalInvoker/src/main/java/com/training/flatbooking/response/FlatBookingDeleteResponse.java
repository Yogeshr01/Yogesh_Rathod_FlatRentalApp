package com.training.flatbooking.response;

import com.training.bean.FlatBooking;

public class FlatBookingDeleteResponse {

	private int statusCode;
	private String message;
	private FlatBooking flatBooking;
	
	
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
	public FlatBooking getFlatBooking() {
		return flatBooking;
	}
	public void setFlatBooking(FlatBooking flatBooking) {
		this.flatBooking = flatBooking;
	}
	
}