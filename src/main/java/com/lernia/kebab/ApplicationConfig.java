package com.lernia.kebab;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;

import com.lernia.kebab.Document.Review;
import com.lernia.kebab.Repository.ReviewRepository;
import com.mongodb.client.model.geojson.Point;

@Configuration
public class ApplicationConfig {

  @Bean
  CommandLineRunner init(ReviewRepository reviewRepository) {
    return args -> {
      System.out.println("Staaaaaaaaaaaaaart");

      // Review rev = new Review();
      // rev.setName("Svingen Pizzeria");
      // rev.setLocation(new GeoJsonPoint(63.821159115988806, 20.287163585181496));
      // reviewRepository.save(rev);

      // Review rev2 = new Review();
      // rev2.setName("Matador");
      // rev2.setLocation(new GeoJsonPoint(63.82221841269281, 20.28387116984073));
      // reviewRepository.save(rev2);

      // Review rev3 = new Review();
      // rev3.setName("Gröna älgen");
      // rev3.setLocation(new GeoJsonPoint(63.823239677623064, 20.279315627511163));
      // reviewRepository.save(rev3);

			System.out.println("Sluuuuuuuuuuuuut");
    };
  }
  
}
