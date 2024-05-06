package com.training.ui;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.training.bean.Flat;
import com.training.bean.FlatBooking;
import com.training.flat.response.FlatAddResponse;
import com.training.flat.response.FlatDeleteResponse;

import com.training.flat.response.FlatGetAllResponse;
import com.training.flat.response.FlatGetResponse;
import com.training.flat.response.FlatUpdateResponse;
import com.training.flatbooking.response.FlatBookingAddResponse;
import com.training.flatbooking.response.FlatBookingDeleteResponse;
import com.training.flatbooking.response.FlatBookingGetAllResponse;
import com.training.flatbooking.response.FlatBookingGetResponse;
import com.training.flatbooking.response.FlatBookingUpdateResponse;

@RestController
@RequestMapping("/flatbookinginvoker")
public class FlatBookingController {

	@Autowired
	RestTemplate restTemplate;

	@PostMapping("/addFlatBooking")
	public ResponseEntity<FlatBookingAddResponse> f1(@RequestBody FlatBooking flatBooking){

	String url="http://02ADMINCLIENT1/FlatBookings/addFlatBooking";
	FlatBooking f1=this.restTemplate.postForObject(url, flatBooking, FlatBooking.class);
	FlatBookingAddResponse response= new FlatBookingAddResponse();
	response.setStatusCode(200);
	response.setFlatBooking(flatBooking);
	response.setMessage("FlatBooking added Successfully");
	return ResponseEntity.ok(response);
	}
	@PutMapping("/updateFlatBooking")
	public ResponseEntity<FlatBookingUpdateResponse> f2(@RequestBody FlatBooking flatBooking){	
		String url="http://02ADMINCLIENT1/FlatBookings/updateFlatBooking";
		this.restTemplate.put(url, flatBooking, FlatBooking.class);
		FlatBookingUpdateResponse response= new FlatBookingUpdateResponse();
		response.setStatusCode(200);
		response.setFlatBooking(flatBooking);
		response.setMessage("FlatBooking updated Successfully");
		return ResponseEntity.ok(response);
	}
	@DeleteMapping("/deleteFlatBooking/{bookingNo}")
	public ResponseEntity<FlatBookingDeleteResponse> f3(@PathVariable(name="bookingNo")int id){
		//Flat flat=new Flat();
       // flat.setFlatId(id);
		String url="http://02ADMINCLIENT1/FlatBookings/deleteFlatBooking/"+id;
		this.restTemplate.delete(url);
		FlatBookingDeleteResponse response= new FlatBookingDeleteResponse();
		response.setStatusCode(200);
		response.setMessage("FlatBooking removed Successfully");
		return ResponseEntity.ok(response);	
	}

	@GetMapping("/getFlatBookingById/{bookingNo}")
	public ResponseEntity<FlatBookingGetResponse> f4(@PathVariable(name="bookingNo") int id){
		String url="http://02ADMINCLIENT1/FlatBookings/getFlatBookingById/" +id;
		FlatBooking f1=this.restTemplate.getForObject(url, FlatBooking.class);
		FlatBookingGetResponse response= new FlatBookingGetResponse();
		response.setStatusCode(200);
		response.setFlatBooking(f1);
		response.setMessage("Flat found by id Successfully");
		return ResponseEntity.ok(response);
	}
	@GetMapping("/getAllFlatBooking")
	public ResponseEntity<FlatBookingGetAllResponse> f5(@RequestBody Flat flat){
		String url="http://02ADMINCLIENT1/FlatBookings/getAllFlatBooking";
		//Flat f1=this.restTemplate.getForObject(url, Flat.class);
		List<FlatBooking> allFlatBookings=this.restTemplate.getForObject(url, List.class);
		FlatBookingGetAllResponse response= new FlatBookingGetAllResponse();
		response.setStatusCode(200);
		response.setGetAllFlatBooking(allFlatBookings);
		response.setMessage("Flats found Successfully");
		return ResponseEntity.ok(response);
	}
	

	}