package com.poli.game.repositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.poli.game.entities.Mission;

@Repository
public interface MissionRepository extends CrudRepository<Mission, Long> {
	
	public Mission findById(long idMission);
}
