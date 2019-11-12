package com.poli.game.repositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.poli.game.entities.Mechanics;
@Repository
public interface MechanicsRepository extends CrudRepository<Mechanics, Long> {
	
	public Mechanics findById(long idMechanics);
}
