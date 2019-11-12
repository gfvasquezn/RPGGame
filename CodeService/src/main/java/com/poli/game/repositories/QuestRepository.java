package com.poli.game.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.poli.game.entities.Quest;

@Repository
public interface QuestRepository extends CrudRepository<Quest, Long> {
	
	public Quest findById(long idQuest);
}
