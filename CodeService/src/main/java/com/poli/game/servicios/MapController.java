package com.poli.game.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.poli.game.entities.Asset;
import com.poli.game.entities.Map;
import com.poli.game.repositories.AssetRepository;
import com.poli.game.repositories.MapRepository;


@RestController
public class MapController {
	
	@Autowired
	private MapRepository mapRepository;
	
	@Autowired
	private AssetRepository assetRepository ;
	
	@RequestMapping("/getAllMaps")
	public Iterable<Map> getAllMaps () {
		
		Iterable<Map> findAll = mapRepository.findAll();
		Asset asset= new Asset();
		for(Map map: findAll) {
			String mapCharacter=map.getCharacterMap();
			map.setCharacterMap("");
			for(int i=0;i<mapCharacter.length();i=i+1) {
				asset=assetRepository.findBySymbol(mapCharacter.charAt(i)+"");
				if(asset!=null) {
					map.setCharacterMap(map.getCharacterMap()+assetRepository.findBySymbol(mapCharacter.charAt(i)+"").getPath()+",");		
				}
			}
			map.setCharacterMap(map.getCharacterMap().substring(0, map.getCharacterMap().length()-1));
		}
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
