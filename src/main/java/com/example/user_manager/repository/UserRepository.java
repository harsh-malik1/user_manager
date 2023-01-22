package com.example.user_manager.repository;

import com.example.user_manager.models.User;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends CrudRepository<User, Integer > {

    @Transactional
    @Modifying
    @Query(value = "insert into users(first_name , last_name  , email , password ) values(:first_name , :last_name  , :email , :password)" , nativeQuery = true)
    int registerNewUser(@Param("first_name") String first_name ,
                        @Param("last_name") String last_name ,
                        @Param("email") String email,
                        @Param("password") String password

    );
}
