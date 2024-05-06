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
import com.training.bean.Landlord;
import com.training.flat.response.FlatDeleteResponse;
import com.training.flat.response.FlatGetAllResponse;
import com.training.landlord.response.LandlordAddResponse;
import com.training.landlord.response.LandlordDeleteResponse;
import com.training.landlord.response.LandlordGetAllResponse;
import com.training.landlord.response.LandlordGetResponse;
import com.training.landlord.response.LandlordUpdateResponse;

@RestController
@RequestMapping("/landlordinvoker")
public class LandlordController {

	@Autowired
	RestTemplate restTemplate;

	@PostMapping("/addLandlord")
	public ResponseEntity<LandlordAddResponse> f1(@RequestBody Landlord landlord){

	String url="http://02ADMINCLIENT1/Landlords/addLandlord";
	Landlord l1=this.restTemplate.postForObject(url, landlord, Landlord.class);
	LandlordAddResponse response= new LandlordAddResponse();
	response.setStatusCode(200);
	response.setLandlord(l1);
	response.setMessage("Landlord added Successfully");
	return ResponseEntity.ok(response);
	}
	@PutMapping("/updateLandlord")
	public ResponseEntity<LandlordUpdateResponse> f2(@RequestBody Landlord landlord){	
		String url="http://02ADMINCLIENT1/Landlords/updateLandlord";
		this.restTemplate.put(url, landlord, Landlord.class);
		LandlordUpdateResponse response= new LandlordUpdateResponse();
		response.setStatusCode(200);
		response.setLandlord(landlord);
		response.setMessage("Landlord updated Successfully");
		return ResponseEntity.ok(response);
	}
	@DeleteMapping("/deleteLandlord/{landlordId}")
	public ResponseEntity<LandlordDeleteResponse> f3(@PathVariable("landlordId") int id){
	    String url="http://02ADMINCLIENT1/Landlords/deleteLandlord/" + id;
	    this.restTemplate.delete(url);
	    LandlordDeleteResponse response= new LandlordDeleteResponse();
	    response.setStatusCode(200);
	    response.setMessage("Landlord removed Successfully");
	    return ResponseEntity.ok(response);
	}
	@GetMapping("/getLandlordById/{landLordId}")
	public ResponseEntity<LandlordGetResponse> f4(@PathVariable(name="landLordId") int id){
		String url="http://02ADMINCLIENT1/Landlords/getLandlordById/" +id;
		Landlord l1=this.restTemplate.getForObject(url, Landlord.class);
		LandlordGetResponse response= new LandlordGetResponse();
		response.setStatusCode(200);
		response.setLandlord(l1);
		response.setMessage("Landlord found by id Successfully");
		return ResponseEntity.ok(response);
	}
	
	@GetMapping("/getAllLandlord")
	public ResponseEntity<LandlordGetAllResponse> f5(@RequestBody Landlord landlord){
		String url="http://02ADMINCLIENT1/Landlords/getAllLandlord";
		//Flat f1=this.restTemplate.getForObject(url, Flat.class);
		List<Landlord> allLandlord=this.restTemplate.getForObject(url, List.class);
		LandlordGetAllResponse response= new LandlordGetAllResponse();
		response.setStatusCode(200);
		response.setGetAllLandlord(allLandlord);
		response.setMessage("Landlord found Successfully");
		return ResponseEntity.ok(response);
	}

}