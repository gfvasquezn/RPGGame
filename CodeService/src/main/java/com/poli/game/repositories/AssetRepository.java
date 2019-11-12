package com.poli.game.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.poli.game.entities.Asset;

@Repository
public interface AssetRepository extends CrudRepository<Asset, Long> {
	
	public Asset findById(long idAsset);
	public Asset findBySymbol(String symbol);
}
