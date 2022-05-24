package com.example.ladingpage.Service;

import com.example.ladingpage.Model.Rol;
import com.example.ladingpage.Model.User;
import com.example.ladingpage.Model.UserDTO;
import com.example.ladingpage.Repository.IUserRepository;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.Optional;

@Service
public class UserService implements IUserService {
    @Autowired
    IUserRepository userRepository;

    @Autowired
    ModelMapper modelMapper;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;


    @Override
    public UserDTO createUser(UserDTO user) {
        user.setId(null);
        return saveUser(user);
    }

    public UserDTO saveUser(UserDTO user){
        User newUser = modelMapper.map(user, User.class);
        newUser.setPassword(bCryptPasswordEncoder.encode(newUser.getPassword()));

        Rol rolUser = new Rol(2, "USER");
        newUser.setRol(rolUser);
        userRepository.save(newUser);

        return modelMapper.map(newUser, UserDTO.class);
    }

    @Override
    public List<UserDTO> getAllUsers() {
        List<User> listUsers = userRepository.findAll();
        return modelMapper.map(listUsers, new TypeToken<List<UserDTO>>(){}.getType());
    }

    @Override
    public UserDTO findUser(Integer id)  {
        Optional<User> findUser = userRepository.findById(id);
        try {
            if(findUser.isPresent()){
                return modelMapper.map(findUser, UserDTO.class);
            }
        }catch (Exception e){

            System.out.println("NOT FOUND USER!!");
            e.getMessage() ;
        }
        return null;
    }

    @Override
    public void deleteUser(Integer id) {
        Optional<User> foundUser = userRepository.findById(id);
        if(foundUser.isPresent()){
            userRepository.deleteById(id);
        }else {
            System.out.println("NOT FOUND ID_USER");
        }

    }


}
