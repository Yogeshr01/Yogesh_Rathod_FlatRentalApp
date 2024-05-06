package com.training.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.Service.FlatBookingService;
import com.training.bean.FlatBooking;

@RestController
@RequestMapping("/FlatBookings")
public class FlatBookingRestControllerImpl implements FlatBookingRestController {

	@Autowired
	private FlatBookingService flatBookingService;

	@Override
	@PostMapping("/addFlatBooking")
	public FlatBooking addFlatBooking(@RequestBody FlatBooking flatbooking) {
		FlatBooking flatbook = this.flatBookingService.addFlatBooking(flatbooking);
		return flatbook;
	}

	@Override
	@PutMapping("/updateFlatBooking")
	public FlatBooking updateFlatBooking(@RequestBody FlatBooking flatbooking) {
		FlatBooking flatbook = this.flatBookingService.updateFlatBooking(flatbooking);
		return flatbook;
	}

	@Override
	@DeleteMapping("/deleteFlatBooking")
	public String deleteFlatBooking(@RequestBody FlatBooking flatbooking) {
		this.flatBookingService.deleteFlatBooking(flatbooking);
		return "faltbooking deleted succesfully";
	}

	@Override
	@GetMapping("/getFlatBookingById/{bookingNo}")
	public FlatBooking getFlatBookingById(@PathVariable("bookingNo") int id) {
		FlatBooking flatbook = this.flatBookingService.getFlatBookingById(id);
		return flatbook;
	}

	@Override
	@GetMapping("/getAllFlatBooking")
	public List<FlatBooking> getAllFlatBooking() {

		return this.flatBookingService.getAllFlatBooking();
	}

}
