package com.poli.game.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.poli.game.entities.MissionHistory;
import com.poli.game.entities.User;
import com.poli.game.repositories.MissionHistoryRepository;
import com.poli.game.repositories.UserRepository;


@RestController
public class MissionHistoryController {
	
	@Autowired
	private MissionHistoryRepository missionHistoryRepository;
	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping("/getAllMissionHistorys")
	public Iterable<MissionHistory> getAllMissionHistorys () {
		
		Iterable<MissionHistory> findAll = missionHistoryRepository.findAll();
		
		return findAll;
		
	}
	
	@RequestMapping(value="/addMissionHistory", method = RequestMethod.POST)
    public String añadirmissionHistory(@RequestBody MissionHistory missionHistory) {//REST Endpoint.
    	missionHistoryRepository.save(missionHistory);
    	return"missionHistory Insertado";
    }

	
	@RequestMapping ("/getMissionHistoryById")
	public MissionHistory getMissionHistoryById (@RequestParam long missionHistoryId) {
		return missionHistoryRepository.findById(missionHistoryId);	
	}
	
	@RequestMapping ("/getMissionHistoryByUserId")
	public MissionHistory getMissionHistoryByUserId (@RequestParam long userId) {
		User user=userRepository.findById(userId);
		return missionHistoryRepository.findByUser(user);	
		
	}
}
