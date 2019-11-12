package com.poli.game.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.poli.game.entities.SpentScore;

@Repository
public interface SpentScoreRepository extends CrudRepository<SpentScore, Long> {
	
	public SpentScore findById(long idSpentScore);
}
