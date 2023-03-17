package com.example.obejercicio4.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "laptop")
public class Laptop {
    
    // atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String brand;
    private Double price;
    private Boolean available;
    
    // constructores

    public Laptop() {
    }

    public Laptop(Long id, String brand, Double price, Boolean available) {
        this.id = id;
        this.brand = brand;
        this.price = price;
        this.available = available;
    }
    
    // getter y setter

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }
   
}
