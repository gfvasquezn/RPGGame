package com.poli.game.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.poli.game.entities.Mechanics;
import com.poli.game.repositories.MechanicsRepository;


@RestController
public class MechanicsController {
	
	@Autowired
	private MechanicsRepository mechanicsRepository;
	
	@RequestMapping("/getAllMechanicss")
	public Iterable<Mechanics> getAllMechanicss () {
		
		Iterable<Mechanics> findAll = mechanicsRepository.findAll();
		
		return findAll;
		
	}
	
	@RequestMapping(value="/addMechanics", method = RequestMethod.POST)
    public String añadirmechanics(@RequestBody Mechanics mechanics) {//REST Endpoint.
    	mechanicsRepository.save(mechanics);
    	return"mechanics Insertado";
    }

	
	@RequestMapping ("/getMechanicsById")
	public Mechanics getMechanicsById (@RequestParam long mechanicsId) {
		return mechanicsRepository.findById(mechanicsId);	
	}
}
