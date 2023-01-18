package com.lernia.kebab.Document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class Review{

  @Id
  private Long id;
  private String name;
  private GeoJsonPoint location;
  
  // TODO:
  // private String review;
  // private String link;
  // private List<String> media;

  public Review() {}

  public Review(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public GeoJsonPoint getLocation() {
    return location;
  }

  public void setLocation(GeoJsonPoint location) {
    this.location = location;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }
  
}
