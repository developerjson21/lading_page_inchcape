package com.example.ladingpage.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "roles")
@Setter
@Getter
public class Rol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;

    public Rol(){};
    public Rol(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    @OneToMany(mappedBy = "rol", fetch = FetchType.LAZY)
    private List<User> listUsers = new ArrayList<>();
}
