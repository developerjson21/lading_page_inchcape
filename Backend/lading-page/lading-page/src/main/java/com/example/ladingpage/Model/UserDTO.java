package com.example.ladingpage.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserDTO {

    private Integer id;
    private String firstName;
    private String lastName;
    private String userName;
    private String email;
    private RolDTO rol;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;

}
