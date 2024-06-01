package com.SpringRestAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.SpringRestAPI.Repositories.AuthorRepo;


@SpringBootApplication(scanBasePackages = "com.SpringRestAPI")
public class SpringRestApiApplication implements CommandLineRunner{

@Autowired
AuthorRepo authorRepo;

	public static void main(String[] args) {
		SpringApplication.run(SpringRestApiApplication.class, args);
 		
	
	}

	@Override
	public void run(String... args) throws Exception {
		// Author author=new Author("mahendra", "mahendra0202@gmail.com");
		// Book book =new Book("Dhoni the untold story", "no");
		// Book book1 =new Book("sachin untold story", "--- ");
		// Book book2 =new Book("Dhube  story", "everything ");
		// Book book3 =new Book("Flying sick", "something ");
		// author.getBooks().add(book);
		// author.getBooks().add(book2);
		// author.getBooks().add(book1);
		// author.getBooks().add(book3);
		// authorRepo.save(author);

	}

}