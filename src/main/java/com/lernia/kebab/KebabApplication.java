package com.lernia.kebab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.lernia.kebab.Document.Review;
import com.lernia.kebab.Repository.ReviewRepository;

@SpringBootApplication
@EnableMongoRepositories
public class KebabApplication{

  @Autowired
  ReviewRepository reviewRepository;

	public static void main(String[] args) {
		SpringApplication.run(KebabApplication.class, args);

	}

  @Bean
	CommandLineRunner init(ReviewRepository repo) {
		return args -> {
			System.out.println("Staaaaaaaaaaaaaart");
      reviewRepository.save(new Review(2L, "Porsnäskiosken"));
			System.out.println("Sluuuuuuuuuuuuut");
		};
	}


}
