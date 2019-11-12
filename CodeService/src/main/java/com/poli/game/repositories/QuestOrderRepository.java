package com.poli.game.repositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.poli.game.entities.QuestOrder;

@Repository
public interface QuestOrderRepository extends CrudRepository<QuestOrder, Long> {
	
	public QuestOrder findById(long idQuestOrder);
}
