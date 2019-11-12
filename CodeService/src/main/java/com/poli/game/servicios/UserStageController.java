package com.poli.game.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.poli.game.entities.UserStage;
import com.poli.game.repositories.UserStageRepository;


@RestController
public class UserStageController {
	
	@Autowired
	private UserStageRepository userStageRepository;
	
	@RequestMapping("/getAllUserStage")
	public Iterable<UserStage> getAllUserStageStage () {
		
		Iterable<UserStage> findAll = userStageRepository.findAll();
		
		return findAll;
		
	}
	
	@RequestMapping(value="/addUserStage", method = RequestMethod.POST)
    public String añadirUserStage(@RequestBody UserStage userStage) {//REST Endpoint.
    	userStageRepository.save(userStage);
    	return"UserStage Insertado";
    }

	
	@RequestMapping ("/getUserStageById")
	public UserStage getUserStageById (@RequestParam long userStageId) {
		return userStageRepository.findById(userStageId);	
	}
}
