package com.lernia.kebab.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lernia.kebab.Document.Review;
import com.lernia.kebab.Repository.ReviewRepository;

@RestController
@RequestMapping("/api")
public class ReviewController {

  private final ReviewRepository reviewRepository;

  public ReviewController(ReviewRepository reviewRepository) {
    this.reviewRepository = reviewRepository;
  }

  @GetMapping("/reviews")
  public List<Review> getAllReviews() {
    return reviewRepository.findAll();
  }
  
}
