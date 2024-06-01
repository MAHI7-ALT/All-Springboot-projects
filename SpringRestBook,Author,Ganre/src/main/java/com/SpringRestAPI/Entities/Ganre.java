package com.SpringRestAPI.Entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Ganre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int gid;
    private String name;
    private String description;

    @ManyToMany(mappedBy = "ganres")
    private List<Book> books = new ArrayList<>();

    public Ganre() {
    }

    public Ganre(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public int getGid() {
        return gid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
