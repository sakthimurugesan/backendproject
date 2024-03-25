package com.basic.backendproject;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepo extends JpaRepository<Users,Integer> {

    @Query("select user from Users user where user.email=:email and user.password=:password")
    List<Users> findByEmailNPassword(String email, String password);
}
