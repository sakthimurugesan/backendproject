package com.basic.backendproject;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class Contr {

    @Autowired
    UserRepo userRepo;

    @Autowired
    BooksRepo booksRepo;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/books")
    public List<Books> getAllProducts()
    {
        return booksRepo.getall();
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/books/{id}")
    public Books getbyid(@PathVariable("id") int id)
    {
        return  booksRepo.findById(id).orElse(new Books());
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PutMapping("/books/{id}")
    public String updatebooks(@PathVariable("id") int id,@RequestBody Books b)
    {
        Books obj=booksRepo.findById(id).orElse(new Books());
        obj.setTitle(b.getTitle());
        obj.setPrice(b.getPrice());
        obj.setRating(b.getRating());
        booksRepo.save(obj);
        return "Successfully updated";
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @DeleteMapping("/books/{id}")
    public String deletebooks(@PathVariable("id") int id)
    {
        Books obj=booksRepo.findById(id).orElse(new Books());
        booksRepo.delete(obj);
        return "Successfully updated";
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/addbook")
    public String add(@RequestBody Books b)
    {
        Books obj=new Books();
        obj.setTitle(b.getTitle());
        obj.setDescription(b.getDescription());
        obj.setRating(b.getRating());
        obj.setPrice(b.getPrice());
        obj.setType(b.getType());
        obj.setFilename(b.getFilename());
        obj.setHeight(b.getHeight());
        obj.setWidth(b.getWidth());
        obj.setTrend(b.getTrend());

        booksRepo.save(obj);
        return "products saved";
    }


    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/adduser")
    public String adduser(@RequestBody Users b)
    {
        System.out.println(b.getEmail());
        userRepo.save(b);
        return "user saved";
    }


    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/users")
    public List<Users> getUser(@RequestParam("email") String email,@RequestParam("password") String password)
    {
        return userRepo.findByEmailNPassword(email,password);
    }


    @CrossOrigin(origins = "http://localhost:3000")

    @PostMapping("/adds")
    public String saveStudents(@RequestBody Books[] books)
    {
        for (int i = 0; i < books.length; i++) {
            booksRepo.save(books[i]);
            System.out.println("created");
        }
        return "Students created";
    }


}
