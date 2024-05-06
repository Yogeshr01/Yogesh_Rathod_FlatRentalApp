package com.training.RestController;

import java.util.List;

import com.training.bean.Landlord;

public interface LandlordRestController {
	Landlord addLandlord(Landlord landlord) ;
	Landlord updateLandlord(Landlord landlord) ;
	String deleteLandlord(int landLordId) ;
	Landlord getLandlordById(int id) ;
	List<Landlord> getAllLandlords();
}
