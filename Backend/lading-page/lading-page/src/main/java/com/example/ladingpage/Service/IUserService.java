package com.example.ladingpage.Service;

import com.example.ladingpage.Model.UserDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IUserService {

    UserDTO createUser(UserDTO user);
    List<UserDTO> getAllUsers();
    UserDTO findUser(Integer id);
    void deleteUser(Integer id);
}
