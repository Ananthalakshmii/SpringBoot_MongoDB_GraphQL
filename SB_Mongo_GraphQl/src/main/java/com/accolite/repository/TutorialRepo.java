package com.accolite.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.accolite.model.Tutorial;

public interface TutorialRepo extends MongoRepository<Tutorial,String>{

}
