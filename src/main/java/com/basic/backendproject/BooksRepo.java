package com.basic.backendproject;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BooksRepo extends JpaRepository<Books,Integer> {

    @Query("select u from Books u")
    public List<Books> getall();

}
