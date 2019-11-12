package com.poli.game.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.poli.game.entities.Map;
import com.poli.game.repositories.MapRepository;


@RestController
public class MapController {
	
	@Autowired
	private MapRepository mapRepository;
	
	@RequestMapping("/getAllMaps")
	public Iterable<Map> getAllMaps () {
		
		Iterable<Map> findAll = mapRepository.findAll();
		
		return findAll;
		
	}
	
	@RequestMapping(value="/addMap", method = RequestMethod.POST)
    public String añadirmap(@RequestBody Map map) {//REST Endpoint.
    	mapRepository.save(map);
    	return"map Insertado";
    }

	
	@RequestMapping ("/getMapById")
	public Map getMapById (@RequestParam long mapId) {
		return mapRepository.findById(mapId);	
	}
}
