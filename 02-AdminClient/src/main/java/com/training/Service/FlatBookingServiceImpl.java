package com.training.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import com.training.bean.FlatBooking;
import com.training.dao.FlatBookingDAO;

@Service
public class FlatBookingServiceImpl implements FlatBookingService {
	
	

	    @Autowired
	    private FlatBookingDAO flatBookingDAO;

	    public FlatBookingDAO getFlatBookingDAO() {
			return flatBookingDAO;
		}

		public void setFlatBookingDAO(FlatBookingDAO flatBookingDAO) {
			this.flatBookingDAO = flatBookingDAO;
		}

		@Override
	    public FlatBooking addFlatBooking(FlatBooking flatbooking) {
			 FlatBooking flatbook=this.flatBookingDAO.save(flatbooking);
			return flatbook;
	        
	    }

	    @Override
	    public FlatBooking updateFlatBooking(FlatBooking flatbooking) {
	      FlatBooking flatbook=this.flatBookingDAO.save(flatbooking);
	    	return flatbook;
	        		
	    }

	   
		@Override
	    public String deleteFlatBooking(FlatBooking flatbooking) {
	       this.flatBookingDAO.delete(flatbooking);
	       return"Flat Booking Deleted Succesfully";
	    }

	    @Override
	    public FlatBooking getFlatBookingById(int bookingNo) {
	       Optional<FlatBooking> flatbookingOptional=this.flatBookingDAO.findById(bookingNo);
	    	if(flatbookingOptional.isPresent())
	    		return flatbookingOptional.get();
	    	else
	       return null;
	    			
	    }

	    @Override
	    public List<FlatBooking> getAllFlatBooking() {
	        return this.flatBookingDAO.findAll();
	    }
	}

