package com.training.flatbooking.response;

import java.util.List;

import com.training.bean.FlatBooking;

public class FlatBookingGetAllResponse {

	private int statusCode;
	private String message;
	private List<FlatBooking> getAllFlatBooking;
	
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
	public List<FlatBooking> getGetAllFlatBooking() {
		return getAllFlatBooking;
	}
	public void setGetAllFlatBooking(List<FlatBooking> getAllFlatBooking) {
		this.getAllFlatBooking = getAllFlatBooking;
	}
	
}