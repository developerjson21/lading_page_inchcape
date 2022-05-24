package com.example.ladingpage.Controller;

import com.example.ladingpage.Model.UserDTO;
import com.example.ladingpage.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/{id}")
    public UserDTO findUser(@PathVariable("id") Integer id ){
        return userService.findUser(id);
    }

    @GetMapping()
    public List<UserDTO> getAllUser(){
        return userService.getAllUsers();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable("id") Integer id){
        userService.deleteUser(id);
        return new ResponseEntity<String>("USER DELETED!", HttpStatus.OK);
    }
}
