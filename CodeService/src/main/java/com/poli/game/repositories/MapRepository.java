package com.poli.game.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.poli.game.entities.Map;

@Repository
public interface MapRepository extends CrudRepository<Map, Long> {
	
	public Map findById(long idMap);
}
