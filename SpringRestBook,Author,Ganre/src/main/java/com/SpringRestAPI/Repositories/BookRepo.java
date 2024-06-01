package com.SpringRestAPI.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringRestAPI.Entities.Book;

@Repository
public interface BookRepo extends JpaRepository<Book , Integer> {

    

    
}
