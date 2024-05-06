package com.training.RestController;

import java.util.List;

import com.training.bean.FlatBooking;

public interface FlatBookingRestController {

	FlatBooking addFlatBooking(FlatBooking flatbooking);

	FlatBooking updateFlatBooking(FlatBooking flatbooking);

	String deleteFlatBooking(FlatBooking flatbooking);

	FlatBooking getFlatBookingById(int id);

	List<FlatBooking> getAllFlatBooking();
}
