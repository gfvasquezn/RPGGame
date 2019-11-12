package com.poli.game.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.poli.game.entities.Mission;
import com.poli.game.repositories.MissionRepository;


@RestController
public class MissionController {
	
	@Autowired
	private MissionRepository missionRepository;
	
	@RequestMapping("/getAllMissions")
	public Iterable<Mission> getAllMissions () {
		
		Iterable<Mission> findAll = missionRepository.findAll();
		
		return findAll;
		
	}
	
	@RequestMapping(value="/addMission", method = RequestMethod.POST)
    public String añadirmission(@RequestBody Mission mission) {//REST Endpoint.
    	missionRepository.save(mission);
    	return"mission Insertado";
    }

	
	@RequestMapping ("/getMissionById")
	public Mission getMissionById (@RequestParam long missionId) {
		return missionRepository.findById(missionId);	
	}
}
