package com.training.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.bean.Flat;
import com.training.bean.Landlord;
import com.training.dao.LandlordDAO;

@Service
public class LandlordServiceImpl implements LandlordService {
	@Autowired
	private LandlordDAO landlordDAO;

	public LandlordDAO getLandlordDAO() {
		return landlordDAO;
	}

	public void setLandlordDAO(LandlordDAO LandlordDAO) {
		this.landlordDAO = LandlordDAO;
	}

	@Override
	public Landlord addLandlord(Landlord landlord) {
		Landlord landlord1 = this.landlordDAO.save(landlord);
		return landlord;
	}

	@Override
	public Landlord updateLandlord(Landlord landlord) {
		Landlord landlord1 = this.landlordDAO.save(landlord);
		return landlord;
	}

	@Override
	public String deleteLandlord(Landlord landlord) {
		this.landlordDAO.delete(landlord);
		return "Flat Booking Deleted Succesfully";
	}

	@Override
	public Landlord getLandlordById(int landLordId) {
		Optional<Landlord> landOptional = this.landlordDAO.findById(landLordId);
		if (landOptional.isPresent())
			return landOptional.get();
		else
			return null;
	}

	@Override
	public List<Landlord> getAllLandlords() {
		return landlordDAO.findAll();
	}
}
