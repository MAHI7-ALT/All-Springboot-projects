package com.jhanu.rest.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jhanu.rest.Entity.Bags;

public interface BagsRepo extends JpaRepository<Bags , Integer> {
    
}
