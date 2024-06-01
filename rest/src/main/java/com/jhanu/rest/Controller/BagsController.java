package com.jhanu.rest.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jhanu.rest.Entity.Bags;
import com.jhanu.rest.Repository.BagsRepo;

@RestController
public class BagsController {
    @Autowired
    BagsRepo bagsRepo;

@GetMapping("/Bags")
public List<Bags> retriveElements(){
    List<Bags> s=bagsRepo.findAll();
    return s;
}
@GetMapping("/Bags/{bagNo}")
public Bags retriveById(@PathVariable int bagNo){
    Bags bags=bagsRepo.findById(bagNo).get();
    return bags;
}
@PutMapping("/bags/UpdateElements/{num}")
public Bags update(@PathVariable int num){
    Bags bags=bagsRepo.findById(num).get();
    bags.setBagName("madrob");
    bags.setBagPrice(10000);
    bagsRepo.save(bags);
return bags;
} 

@PostMapping("/bags/UpdateElements")
public Bags update(@RequestBody Bags bags){
    bagsRepo.save(bags);
    return bags;
    
}
}
