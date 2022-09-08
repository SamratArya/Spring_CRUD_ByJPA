package com.basic.respository;

import org.springframework.data.repository.CrudRepository;

import com.basic.entities.Books;

public interface BooksRespository extends CrudRepository<Books, Integer>{

}
