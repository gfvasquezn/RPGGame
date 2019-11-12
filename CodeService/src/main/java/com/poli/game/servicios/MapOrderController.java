package com.poli.game.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.poli.game.entities.Map;
import com.poli.game.entities.MapOrder;
import com.poli.game.repositories.MapOrderRepository;


@RestController
public class MapOrderController {
	
	@Autowired
	private MapOrderRepository mapOrderRepository;
	
	@RequestMapping("/getAllMapOrders")
	public Iterable<MapOrder> getAllMaps () {
		
		Iterable<MapOrder> findAll = mapOrderRepository.findAll();
		
		return findAll;
		
	}
	
	@RequestMapping(value="/addMapOrder", method = RequestMethod.POST)
    public String añadirmap(@RequestBody Map map) {//REST Endpoint.
    	return"map Insertado";
    }

	
	@RequestMapping ("/getMapOrderById")
	public MapOrder getMapById (@RequestParam long mapId) {
		return mapOrderRepository.findById(mapId);	
	}
}
