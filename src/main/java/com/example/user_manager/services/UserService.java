package com.example.user_manager.services;


import com.example.user_manager.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// used to call methods in class user_repository
@Service
public class UserService {

    @Autowired
    UserRepository userRepository;
    public int registerNewUserServiceMethod(String fname , String lname , String email , String password ){
        return userRepository.registerNewUser(fname, lname, email, password);
    }
}
