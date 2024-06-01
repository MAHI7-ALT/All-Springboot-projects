package com.SpringRestAPI.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.SpringRestAPI.Entities.Book;
import com.SpringRestAPI.Entities.Ganre;
import com.SpringRestAPI.Repositories.BookRepo;
import com.SpringRestAPI.Repositories.GanreRepo;


@RestController
public class BookController {
    @Autowired
    BookRepo bookRepo;
    @Autowired
    GanreRepo ganreRepo;

    
    

     @GetMapping("/Book/Retrive")
     public List<Book> getAllStudents(){
      List<Book> books=bookRepo.findAll();
       return books; 
       
   }

  @DeleteMapping("/Book/delete/{bid}")

    public void deleteBookById(@PathVariable int bid){
        Book book =bookRepo.findById(bid).get();
        bookRepo.delete(book);

    }

    @DeleteMapping("/Ganre/delete/{gid}")

    public void deleteGanreById(@PathVariable int gid){
        Ganre ganre =ganreRepo.findById(gid).get();
        ganreRepo.delete(ganre);

    }
    
}
