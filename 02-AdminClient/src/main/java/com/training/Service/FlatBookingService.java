package com.training.Service;

import java.util.List;


import com.training.bean.FlatBooking;

public interface FlatBookingService {
	 FlatBooking addFlatBooking(FlatBooking flatbooking);
	    FlatBooking updateFlatBooking(FlatBooking flatbooking);
	   String deleteFlatBooking(FlatBooking flatbooking);
	    FlatBooking getFlatBookingById(int bookingNo);
	    List<FlatBooking> getAllFlatBooking();
}
