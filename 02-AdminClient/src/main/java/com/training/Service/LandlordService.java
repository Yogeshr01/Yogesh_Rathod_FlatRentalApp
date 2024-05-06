package com.training.Service;

import java.util.List;

import com.training.bean.Landlord;

public interface LandlordService {
	 Landlord addLandlord(Landlord landlord);
	    
	    Landlord updateLandlord(Landlord landlord);
	    
	    String deleteLandlord(Landlord landlord);
	    
	    Landlord getLandlordById(int landLordId);
	    
	    List<Landlord> getAllLandlords();
}
