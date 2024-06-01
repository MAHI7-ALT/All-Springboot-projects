package com.SpringRestAPI.Entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bid;
    private String title;
    private String tagline;
    
    @ManyToOne
    @JoinColumn(name = "author_id") // Define the join column for the Author entity
    private Author author;
    
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
        name = "book_genre",
        joinColumns = @JoinColumn(name = "book_id"),
        inverseJoinColumns = @JoinColumn(name = "genre_id")
    )
    private List<Ganre> ganres = new ArrayList<>();

    public Book() {
    }

    public Book(String title, String tagline) {
        this.title = title;
        this.tagline = tagline;
    }

    public int getBid() {
        return bid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTagline() {
        return tagline;
    }

    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public List<Ganre> getGanres() {
        return ganres;
    }

    public void setGanres(List<Ganre> ganres) {
        this.ganres = ganres;
    }
}
