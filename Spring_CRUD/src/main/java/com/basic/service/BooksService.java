package com.basic.service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.basic.entities.Books;
import com.basic.respository.BooksRespository;

//defining the business logic
@Service
public class BooksService {

	@Autowired
	BooksRespository booksRespository;

	// getting all books record by using the method findaAll() of CrudRepository
	public List<Books> getAllBooks() {
		List<Books> books = new ArrayList<>();

		// Here we are using for each loop with the help of lambda expression
		booksRespository.findAll().forEach(Books1 -> books.add(Books1));
		return books;
	}

	// getting a specific record by using the method findById() of CrudRepository
	public Books getBooksById(int id) {
		return booksRespository.findById(id).get();
	}

	// saving a specific record by using the method save() of CrudRepository
	public void saveOrUpdate(Books books) {
		booksRespository.save(books);
	}

	// deleting a specific record by using the method deleteById() of CrudRepository
	public void delete(int id) {
		booksRespository.deleteById(id);
	}

	// updating a record
	public void update(Books books, int bookid) {
		booksRespository.save(books);
	}

}
