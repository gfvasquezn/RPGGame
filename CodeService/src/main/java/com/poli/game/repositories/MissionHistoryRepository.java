package com.poli.game.repositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.poli.game.entities.Mission;
import com.poli.game.entities.MissionOrder;
import com.poli.game.entities.User;
import com.poli.game.entities.MissionHistory;

@Repository
public interface MissionHistoryRepository extends CrudRepository<MissionHistory, Long> {
	
	public MissionHistory findById(long idMissionOrder);
	public MissionHistory findByUser(User user);

}
