package com.example.ladingpage.Model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "vehicles")
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String categoria;
    private String nickName;
    private String vehicleIdentificationNumber;
    private String urlImage;

    public Vehicle(){};

    public Vehicle(String categoria, String nickName, String vehicleIdentificationNumber, String urlImage) {
        this.categoria = categoria;
        this.nickName = nickName;
        this.vehicleIdentificationNumber = vehicleIdentificationNumber;
        this.urlImage = urlImage;
    }

    @ManyToOne(fetch= FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinColumn (name = "user_id")
    private User user;

    @ManyToOne(fetch= FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinColumn(name = "category_id")
    private Category category;
}
