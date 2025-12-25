package com.foodiehub_backend.entity;
import java.util.List;

import jakarta.persistence.*;


@Entity
@Table(name = "restaurants")
public class Restaurant {
	


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String location;
    private String cuisine;
    
    @OneToMany(mappedBy = "restaurant", cascade = CascadeType.ALL)
	private java.util.List<Dish> dishes;

    // Default constructor (MANDATORY for JPA)
    public Restaurant() {
    }

    // Parameterized constructor
    public Restaurant(Long id, String name, String location, String cuisine) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.cuisine = cuisine;
    }

    // Getters and Setters (MANUAL)

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCuisine() {
        return cuisine;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }
}
