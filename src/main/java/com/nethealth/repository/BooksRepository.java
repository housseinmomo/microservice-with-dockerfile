package com.nethealth.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nethealth.model.Book;

public interface BooksRepository extends MongoRepository<Book, String>{

}
