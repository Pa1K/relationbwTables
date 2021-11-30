package com.pavan.relations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.pavan.relations.model.Address;
import com.pavan.relations.model.User;
import com.pavan.relations.repository.AddressRepository;
import com.pavan.relations.repository.UserRepository;

@SpringBootApplication
public class RelationsBwTablesApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(RelationsBwTablesApplication.class, args);
	}
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private AddressRepository addressRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		//User Object
		User user = new User();
		user.setUsername("pavan");
		
		User user2 = new User("Ram");
		
		//Address Object
		Address address = new Address();
		address.setStreet("green");
		address.setCity("bellary");
		
		Address address2 = new Address("blue","jaipur");
		
		user.setAddress(address);
		user2.setAddress(address2);
		
		address.setUser(user);
		address2.setUser(user2);
		
		
		//user.setAddress(address);
		//address.setUser(user);
		
		/*
		 * user.getAddress().add(address); user.getAddress().add(address2);
		 */
		
		userRepository.save(user);
		userRepository.save(user2);
	}

}
