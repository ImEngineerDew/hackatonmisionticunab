package com.ejemplo.tiendaalamano.model;
import javax.persistence.*;

@Entity
@Table(name= "users")
public class UserModel
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100, nullable= false)
    private String name;

    @Column(length = 100, nullable= false)
    private int identification;

    @Column(length = 100, nullable = false)
    private String address;

    //private Usuario userRol;

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

    public Integer getIdentification() {
        return identification;
    }

    public void setIdentification(Integer identification) {
        this.identification = identification;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
