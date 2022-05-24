package com.example.ladingpage.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
@Setter
@Getter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private String email;


    @ManyToOne(fetch= FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinColumn(name = "rol_id")
    private Rol rol;

    public User(){};
    public User(String firstName, String lastName, String userName, String password, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
        this.email = email;
    }

    // Options to Fetch: LAZY = fetch when needed , EAGER = fetch immediately

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<Vehicle> listVehicles = new ArrayList<>();
}
