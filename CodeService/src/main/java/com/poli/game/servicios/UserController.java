package com.poli.game.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.poli.game.entities.User;
import com.poli.game.repositories.UserRepository;


@RestController
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping("/getAllUsers")
	public Iterable<User> getAllUsers () {
		
		Iterable<User> findAll = userRepository.findAll();
		
		return findAll;
		
	}
	
	@RequestMapping(value="/addUser", method = RequestMethod.POST)
    public String añadiruser(@RequestBody User user) {//REST Endpoint.
    	userRepository.save(user);
    	return"user Insertado";
    }

	
	@RequestMapping ("/getUserById")
	public User getUserById (@RequestParam long userId) {
		return userRepository.findById(userId);	
	}
}
