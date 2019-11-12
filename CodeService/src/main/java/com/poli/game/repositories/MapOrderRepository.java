package com.poli.game.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.poli.game.entities.MapOrder;

@Repository
public interface MapOrderRepository extends CrudRepository<MapOrder, Long> {
	
	public MapOrder findById(long idMapOrder);
}
