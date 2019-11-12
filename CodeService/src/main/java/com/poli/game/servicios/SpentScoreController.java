package com.poli.game.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.poli.game.entities.SpentScore;
import com.poli.game.repositories.SpentScoreRepository;


@RestController
public class SpentScoreController {
	
	@Autowired
	private SpentScoreRepository spentScoreRepository;
	
	@RequestMapping("/getAllSpentScores")
	public Iterable<SpentScore> getAllSpentScores () {
		
		Iterable<SpentScore> findAll = spentScoreRepository.findAll();
		
		return findAll;
		
	}
	
	@RequestMapping(value="/addSpentScore", method = RequestMethod.POST)
    public String añadirspentScore(@RequestBody SpentScore spentScore) {//REST Endpoint.
    	spentScoreRepository.save(spentScore);
    	return"spentScore Insertado";
    }

	
	@RequestMapping ("/getSpentScoreById")
	public SpentScore getSpentScoreById (@RequestParam long spentScoreId) {
		return spentScoreRepository.findById(spentScoreId);	
	}
}
