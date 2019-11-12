package com.poli.game.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.poli.game.entities.UserStage;

@Repository
public interface UserStageRepository extends CrudRepository<UserStage, Long> {
	
	public UserStage findById(long idUserStage);
}
