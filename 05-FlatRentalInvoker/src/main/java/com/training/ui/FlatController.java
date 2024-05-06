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
import com.training.flat.response.FlatAddResponse;
import com.training.flat.response.FlatDeleteResponse;
import com.training.flat.response.FlatGetAllByCostResponse;
import com.training.flat.response.FlatGetAllResponse;
import com.training.flat.response.FlatGetResponse;
import com.training.flat.response.FlatUpdateResponse;

@RestController
@RequestMapping("/flatinvoker")
public class FlatController {

	@Autowired
	RestTemplate restTemplate;

	@PostMapping("/addFlat")
	public ResponseEntity<FlatAddResponse> f1(@RequestBody Flat flat){

	String url="http://02ADMINCLIENT1/Flats/addFlat";
	Flat f1=this.restTemplate.postForObject(url, flat, Flat.class);
	FlatAddResponse response= new FlatAddResponse();
	response.setStatusCode(200);
	response.setFlat(f1);
	response.setMessage("Flat added Successfully");
	return ResponseEntity.ok(response);
	}
	@PutMapping("/updateFlat")
	public ResponseEntity<FlatUpdateResponse> f2(@RequestBody Flat flat){	
		String url="http://02ADMINCLIENT1/Flats/updateFlat";
		this.restTemplate.put(url, flat, Flat.class);
		FlatUpdateResponse response= new FlatUpdateResponse();
		response.setStatusCode(200);
		response.setFlat(flat);
		response.setMessage("Flat updated Successfully");
		return ResponseEntity.ok(response);
	}
	@DeleteMapping("/deleteFlat/{flatId}")
	public ResponseEntity<FlatDeleteResponse> f3(@PathVariable(name="flatId")int id){
		//Flat flat=new Flat();
       // flat.setFlatId(id);
		String url="http://02ADMINCLIENT1/Flats/deleteFlat/"+id;
		this.restTemplate.delete(url);
		FlatDeleteResponse response= new FlatDeleteResponse();
		response.setStatusCode(200);
		response.setMessage("Flat removed Successfully");
		return ResponseEntity.ok(response);	
	}

	
	@GetMapping("/getFlatById/{flatId}")

	public ResponseEntity<FlatGetResponse> f4(@PathVariable(name="flatId") int id){
		String url="http://02ADMINCLIENT1/Flats/getFlatById/" +id;
		Flat f1=this.restTemplate.getForObject(url, Flat.class);
		FlatGetResponse response= new FlatGetResponse();
		response.setStatusCode(200);
		response.setFlat(f1);
		response.setMessage("Flat found by id Successfully");
		return ResponseEntity.ok(response);
	}
	@GetMapping("/getAllFlat")
	public ResponseEntity<FlatGetAllResponse> f5(@RequestBody Flat flat){
		String url="http://02ADMINCLIENT1/Flats/getAllFlat";
		//Flat f1=this.restTemplate.getForObject(url, Flat.class);
		List<Flat> allFlats=this.restTemplate.getForObject(url, List.class);
		FlatGetAllResponse response= new FlatGetAllResponse();
		response.setStatusCode(200);
		response.setAllFlats(allFlats);
		response.setMessage("Flats found Successfully");
		return ResponseEntity.ok(response);
	}
	@GetMapping("/getAllFlatByCost/{cost}")
	public ResponseEntity<FlatGetAllByCostResponse> f6(@PathVariable("cost") int cost){
	    String url="http://02ADMINCLIENT1/Flats/getAllFlatByCost/" + cost;
	    FlatGetAllByCostResponse response = new FlatGetAllByCostResponse(this.restTemplate.getForObject(url, List.class));
	    response.setStatusCode(200);
	    response.setMessage("Flats found by cost Successfully");
	    return ResponseEntity.ok(response);
	}

}