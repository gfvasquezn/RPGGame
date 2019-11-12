package com.poli.game.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.poli.game.entities.Quest;
import com.poli.game.repositories.QuestRepository;


@RestController
public class QuestController {
	
	@Autowired
	private QuestRepository questRepository;
	
	@RequestMapping("/getAllQuests")
	public Iterable<Quest> getAllQuests () {
		
		Iterable<Quest> findAll = questRepository.findAll();
		
		return findAll;
		
	}
	
	@RequestMapping(value="/addQuest", method = RequestMethod.POST)
    public String añadirquest(@RequestBody Quest quest) {//REST Endpoint.
    	questRepository.save(quest);
    	return"quest Insertado";
    }

	
	@RequestMapping ("/getQuestById")
	public Quest getQuestById (@RequestParam long questId) {
		return questRepository.findById(questId);	
	}
}
