package org.example.mongo_g146.repository;

import org.example.mongo_g146.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
