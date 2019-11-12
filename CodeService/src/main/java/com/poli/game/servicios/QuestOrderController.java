package com.poli.game.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.poli.game.entities.QuestOrder;
import com.poli.game.repositories.QuestOrderRepository;


@RestController
public class QuestOrderController {
	
	@Autowired
	private QuestOrderRepository questOrderRepository;
	
	@RequestMapping("/getAllQuestOrders")
	public Iterable<QuestOrder> getAllQuestOrders () {
		
		Iterable<QuestOrder> findAll = questOrderRepository.findAll();
		
		return findAll;
		
	}
	
	@RequestMapping(value="/addQuestOrder", method = RequestMethod.POST)
    public String añadirquestOrder(@RequestBody QuestOrder questOrder) {//REST Endpoint.
    	questOrderRepository.save(questOrder);
    	return"questOrder Insertado";
    }

	
	@RequestMapping ("/getQuestOrderById")
	public QuestOrder getQuestOrderById (@RequestParam long questOrderId) {
		return questOrderRepository.findById(questOrderId);	
	}
}
