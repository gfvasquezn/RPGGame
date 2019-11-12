package com.poli.game.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.poli.game.entities.MissionOrder;
import com.poli.game.repositories.MissionOrderRepository;


@RestController
public class MissionOrderController {
	
	@Autowired
	private MissionOrderRepository missionOrderRepository;
	
	@RequestMapping("/getAllMissionOrders")
	public Iterable<MissionOrder> getAllMissionOrders () {
		
		Iterable<MissionOrder> findAll = missionOrderRepository.findAll();
		
		return findAll;
		
	}
	
	@RequestMapping(value="/addMissionOrder", method = RequestMethod.POST)
    public String añadirmissionOrder(@RequestBody MissionOrder missionOrder) {//REST Endpoint.
    	missionOrderRepository.save(missionOrder);
    	return"missionOrder Insertado";
    }

	
	@RequestMapping ("/getMissionOrderById")
	public MissionOrder getMissionOrderById (@RequestParam long missionOrderId) {
		return missionOrderRepository.findById(missionOrderId);	
	}
}
