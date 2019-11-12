package com.poli.game.repositories;

import java.util.List;
import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.poli.game.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	
	public User findById(long idUser);
}
