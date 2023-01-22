package com.example.user_manager.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

import java.util.Date;

@Entity  // specifies that the class is an entity and is mapped to a database table
@Table(name = "users")     // our database table name is users basically used to specify table
public class User {

    @Id   // indicating the member field below is the primary key of the current entity
    private int user_id ;
    private String first_name ;
    private String last_name ;
    private String email ;
    private String password ;
    private Date created_at ;

    @Transient   // tells the JPA provider to not persist any (non-transient) attribute.
//  updated_at gives error if we access that becase it is not updated when we will create database
    private Date updated_at ;

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }
}