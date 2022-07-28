package com.accolite.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.accolite.model.Author;

public interface AuthorRepo extends MongoRepository<Author, String>{

}
