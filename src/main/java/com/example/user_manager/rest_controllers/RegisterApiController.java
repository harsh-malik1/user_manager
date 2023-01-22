package com.example.user_manager.rest_controllers;

import com.example.user_manager.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController      // used to response entity
@RequestMapping("/api")
public class RegisterApiController {
    @Autowired
    UserService userService ;
    @PostMapping("/user/register")
    public ResponseEntity registerNewUser(
            @Param("first_name") String first_name ,
            @Param("last_name") String last_name ,
            @Param("email") String email,
            @Param("password") String password){
//        Encrypt Hash Password
        if(first_name.isEmpty() || last_name.isEmpty() || password.isEmpty() || email.isEmpty() ){
            return new ResponseEntity<>("Please complete all fields " , HttpStatus.BAD_REQUEST) ;
        }
        System.out.println(first_name + " " + last_name + " " + email + " " + password );

        String hashed_password = BCrypt.hashpw(password , BCrypt.gensalt()) ;
        int result = userService.registerNewUserServiceMethod(first_name, last_name, email, password);
        if(result != 1 ){
            return new ResponseEntity<>("Failed to Register User" , HttpStatus.BAD_REQUEST) ;
        }
        return new ResponseEntity<>("User Register Successfull" , HttpStatus.OK) ;
    }
}
