package com.SpringRestAPI.Entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int aid;
    private String name;
    private String email;
   
    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL) // Adjust mappedBy to reference the correct field
    private List<Book> books = new ArrayList<>();

    public Author() {
    }

    public Author(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public int getAid() {
        return aid;
    }
 
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
