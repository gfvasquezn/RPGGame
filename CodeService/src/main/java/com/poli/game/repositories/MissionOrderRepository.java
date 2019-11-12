package com.poli.game.repositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.poli.game.entities.Mission;
import com.poli.game.entities.MissionOrder;

@Repository
public interface MissionOrderRepository extends CrudRepository<MissionOrder, Long> {
	
	public MissionOrder findById(long idMissionOrder);
}
