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

import com.training.Service.LandlordService;
import com.training.bean.Landlord;
@RestController
@RequestMapping("/Landlords")
public class LandlordRestControllerImpl implements LandlordRestController{
	@Autowired
	private LandlordService landlordService;

	@Override
	@PostMapping("/addLandlord")
	public Landlord  addLandlord(@RequestBody Landlord landlord) {
		Landlord l=this.landlordService.addLandlord(landlord);
		return l;
	}

	@Override
	@PutMapping("/updateLandlord")
	public Landlord updateLandlord(@RequestBody Landlord landlord) {
		Landlord l=this.landlordService.updateLandlord(landlord);
		return l;
	}

	@Override
	@DeleteMapping("/deleteLandlord")
	public String deleteLandlord(@RequestBody Landlord landlord) {
		this.landlordService.deleteLandlord(landlord);
		return "Landlord deleted successfully";
	}

	@Override
	@GetMapping("/getLandlordById/{landLordId}")
	public Landlord getLandlordById(@PathVariable("landLordId") int id) {
		Landlord l1=this.landlordService.getLandlordById(id);	
			return l1;
	}

	@Override
	@GetMapping("/getAllLandlord")
	public List<Landlord> getAllLandlords() {
		return this.landlordService.getAllLandlords();
	}
	
	

}