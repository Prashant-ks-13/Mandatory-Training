package com.example.Assign_22.Repositories;

import com.dealsapp.user_management_mcs.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepository extends MongoRepository<User, String> {
	 Optional<User> findByUserName(String username);

		Optional<User> findById(String userId);
		
		public void deleteById(String id);

}
