package com.lernia.kebab.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lernia.kebab.Document.Review;

public interface ReviewRepository extends MongoRepository<Review, Long>{

  
  
}
