package com.training.RestController;

import java.util.LinkedList;
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

import com.training.Service.FlatService;
import com.training.bean.Flat;

@RestController
@RequestMapping("/Flats")
public class FlatRestControllerImpl implements FlatRestController {
	@Autowired
	FlatService flatService;

	@Override
	@PostMapping("/addFlat")
	public Flat addFlat(@RequestBody Flat flat) {
		Flat f = this.flatService.addFlat(flat);
		return f;
	}

	@Override
	@PutMapping("/updateFlat")
	public Flat updateFlat(@RequestBody Flat flat) {
		Flat f = this.flatService.updateFlat(flat);
		return f;
	}

	@Override
	@DeleteMapping("/deleteFlat")
	public String deleteFlat(@RequestBody Flat flat) {
		this.flatService.deleteFlat(flat);
		return "flat deleted successfully";
	}

	@Override
	@GetMapping("/getFlatById/{flatId}")
	public Flat getFlatById(@PathVariable("flatId") int id) {
		Flat f1 = this.flatService.getFlatById(id);

		return f1;
	}

	@Override
	@GetMapping("/getAllFlat")
	public List<Flat> getAllFlats() {
		return this.flatService.getAllFlats();
	}

	@Override
	@GetMapping("/getAllFlatByCost/{cost}")
	public List<Flat> getAllFlatsByCost(@PathVariable("cost") float cost) {
		List<Flat> allFlats = this.flatService.getAllFlatsByCost(cost);
		List<Flat> filteredFlats = new LinkedList<>();
		for (Flat f : allFlats) {
			if (f.getCost() == cost && f.getAvailability().equalsIgnoreCase("available")) {
				filteredFlats.add(f);
			}
		}
		return filteredFlats;
	}

}
