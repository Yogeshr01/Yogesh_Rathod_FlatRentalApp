package com.training.Service;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.bean.Flat;
import com.training.bean.FlatBooking;
import com.training.dao.FlatDAO;

@Service
public class FlatServiceImpl implements FlatService {

	@Autowired
	private FlatDAO flatdao;

	public FlatDAO getFlatdao() {
		return flatdao;
	}
	
	public void setFlatdao(FlatDAO flatdao) {
		this.flatdao = flatdao;

	}
	@Override
	public  Flat addFlat(Flat flat) {
	Flat flat1=this.flatdao.save(flat);
	return flat;
	
}
	@Override
public  Flat updateFlat(Flat flat) {
	Flat flat1=this.flatdao.save(flat);
	return flat;
	
}
@Override
public String deleteFlat(Flat flat) {
   this.flatdao.delete(flat);
   return"Flat Booking Deleted Succesfully";
}
@Override
public Flat getFlatById(int flatId) {
	 Optional<Flat> flatOptional=this.flatdao.findById(flatId);
 	if(flatOptional.isPresent())
 		return flatOptional.get();
 	else
    return null;
}
@Override
public List<Flat> getAllFlats() {
    return this.flatdao.findAll();
}
@Override
public List<Flat>getAllFlatsByCost(float cost) {
	List<Flat> allFlats=this.flatdao.findAll();
	List<Flat> filteredFlats=new LinkedList<>();
	for(Flat f: allFlats)
	{
		if(f.getCost()==cost && f.getAvailability().equalsIgnoreCase("available"))
		{
			filteredFlats.add(f);
		}
	}
	return filteredFlats;
}
}