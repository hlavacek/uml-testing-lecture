package com.accenture.ddc.sdj.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;

import com.accenture.ddc.sdj.entity.Book;

public interface BookService {

	@RequestMapping(value = "/books/{id}")
	Book findBook(Long id);
	
	@RequestMapping(value = "/books")
	List<Book> getAllBooks();

}
