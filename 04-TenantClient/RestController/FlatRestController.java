package com.training.RestController;

import java.util.List;

import com.training.bean.Flat;

public interface FlatRestController {

	Flat addFlat(Flat flat);
    
    Flat updateFlat(Flat flat);
    
    String deleteFlat(Flat flat);
    
    Flat getFlatById(int flatId);
    
    List<Flat> getAllFlats();
    
    List<Flat> getAllFlatsByCost(float cost);
}
