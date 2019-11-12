package com.poli.game.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.poli.game.entities.Asset;
import com.poli.game.repositories.AssetRepository;


@RestController
public class AssetController {
	
	@Autowired
	private AssetRepository assetRepository;
	
	@RequestMapping("/getAllAssets")
	public Iterable<Asset> getAllAssets () {
		
		Iterable<Asset> findAll = assetRepository.findAll();
		
		return findAll;
		
	}
	
	@RequestMapping(value="/addAsset", method = RequestMethod.POST)
    public String añadirasset(@RequestBody Asset asset) {//REST Endpoint.
    	assetRepository.save(asset);
    	return"asset Insertado";
    }

	
	@RequestMapping ("/getAssetById")
	public Asset getAssetById (@RequestParam long assetId) {
		return assetRepository.findById(assetId);	
	}
	@RequestMapping ("/getAssetBySymbol")
	public Asset getAssetById (@RequestParam String assetSymbol) {
		return assetRepository.findBySymbol(assetSymbol);	
	}
}
