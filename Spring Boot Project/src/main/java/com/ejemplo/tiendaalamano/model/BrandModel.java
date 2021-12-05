package com.ejemplo.tiendaalamano.model;
import javax.annotation.processing.Generated;
import javax.persistence.*;

@Entity
@Table(name = "brands")
public class BrandModel
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String brand;

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
}
