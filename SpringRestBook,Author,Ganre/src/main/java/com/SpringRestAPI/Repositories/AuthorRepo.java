package com.SpringRestAPI.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringRestAPI.Entities.Author;

@Repository
public interface AuthorRepo extends JpaRepository<Author , Integer> {

 


    
}
