package com.basic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.basic.entities.Books;
import com.basic.respository.BooksRespository;
import com.basic.service.BooksService;

@SpringBootApplication
public class SpringCrudApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringCrudApplication.class, args);
		System.out.println("Hello world");

		// using book repository
//		----------------------------------------------------------------------------------------------

		// For single data
//		BooksService booksService = context.getBean(BooksService.class);

		// For Multiple data
//		BooksRespository booksRespository = context.getBean(BooksRespository.class);

//		Books books = new Books();

		// Single data insert
//		books.setBookid(1);
//		books.setBookname("Core Java");
//		books.setAuthor("R.N rao");
//		books.setPrice(1200);
//		booksService.saveOrUpdate(books);
//		System.out.println("Done");

		// Multiple data insert
//		Books books1 = new Books();
//		Books books2 = new Books();
//
//		books1.setBookid(2);
//		books1.setBookname("Advance Java");
//		books1.setAuthor("R.N rao");
//		books1.setPrice(1500);
//
//		books2.setBookid(3);
//		books2.setBookname("C++");
//		books2.setAuthor("P.J Krishnan");
//		books2.setPrice(700);
//
//		List<Books> l1 = new ArrayList<>();
//		l1.add(books1);
//		l1.add(books2);
//		Iterable<Books> reIterable = booksRespository.saveAll(l1);
//
//		Iterator<Books> itr = reIterable.iterator();
//		while (itr.hasNext()) {
//			Books b1 = itr.next();
//			System.out.println(b1.getBookid() + " " + b1.getBookname() + " " + b1.getAuthor() + " " + b1.getPrice());
//		}
//
//		System.out.println("Done");

		// update the books details
//		Optional<Books> optional = booksRespository.findById(3);
//		books = optional.get();
//		books.setAuthor("P.Jadhav Krishna");
//		Books resBooks = booksRespository.save(books);
//		System.out.println(resBooks.toString());

		// get all the data
//		Iterable<Books> iterable = booksRespository.findAll();
//		Iterator<Books> itr = iterable.iterator();
//		
//		while(itr.hasNext())
//		{
//			Books b1 = itr.next();
//			System.out.println(b1.getBookid()+" "+b1.getBookname()+" "+b1.getAuthor()+" "+b1.getPrice());
//		}

		// get the data by id
//		Object ob1 =  booksRespository.findById(3);
//		System.out.println(ob1);

		// deleting the data by id
//		booksRespository.deleteById(3);
//		System.out.println("deleted");

		// delete all the data
//		booksRespository.deleteAll();
//		System.out.println("All the data gets deleted");

		// using book service
//		----------------------------------------------------------------------------------------------

		BooksService boService = context.getBean(BooksService.class);
		Books books = new Books();

		// single data insert
//		books.setBookid(4);
//		books.setBookname("C");
//		books.setAuthor("Henry Damat");
//		books.setPrice(1450);
//		boService.saveOrUpdate(books);	
//		System.out.println("Value has been inserted");

		// get all the data
//		Iterable<Books> iterable = boService.getAllBooks();
//		Iterator<Books> itr = iterable.iterator();
//		while (itr.hasNext()) {
//			Books b1 = itr.next();
//			System.out.println(b1.getBookid() + " " + b1.getBookname() + " " + b1.getAuthor() + " " + b1.getPrice());
//		}

		// get the data by id
//		Object ob1 = boService.getBooksById(2);
//		System.out.println(ob1.toString());
		
		
		// delete the data by id
//		boService.delete(4);
//		System.out.println("Value has been deleted ");
		
		
		//update the data
		boService.update(books, 3);
		System.out.println("Value has been updated");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
