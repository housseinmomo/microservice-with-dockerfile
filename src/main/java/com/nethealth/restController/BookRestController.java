package com.nethealth.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nethealth.model.Book;
import com.nethealth.repository.BooksRepository;

@RestController
@RequestMapping("/books")
public class BookRestController {
	
	@Autowired
	private BooksRepository repo;
	
	@PostMapping("")
	public ResponseEntity<Book> save(@RequestBody Book book){
		Book registredBook = repo.save(book);
		return new ResponseEntity<Book>(registredBook, HttpStatus.CREATED);
	}
	
	@GetMapping("")
	public ResponseEntity<Object> getAll(){
		List<Book> listOfBook = repo.findAll();
		return new ResponseEntity<Object>(listOfBook, HttpStatus.OK);
	}

}
