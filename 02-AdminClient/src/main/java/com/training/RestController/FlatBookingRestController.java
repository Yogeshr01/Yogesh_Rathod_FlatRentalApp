package com.training.RestController;

import java.util.List;

import com.training.bean.FlatBooking;

public interface FlatBookingRestController {

	FlatBooking addFlatBooking(FlatBooking flatBooking) ;
	FlatBooking updateFlatBooking(FlatBooking flatBooking) ;
	String deleteFlatBooking(int bookingNo) ;
	FlatBooking getFlatBookingById(int id)  ;
	List<FlatBooking> getAllFlatBooking();
}

