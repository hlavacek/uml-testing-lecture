package com.accenture.ddc.sdj.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.accenture.ddc.sdj.entity.Book;
import com.accenture.ddc.sdj.repository.BookRepository;
import com.accenture.ddc.sdj.service.BookService;

@RestController
public class BookServiceImpl implements BookService {

	private static Logger LOG = LoggerFactory
			.getLogger(BookServiceImpl.class);
	
	@Autowired
	private BookRepository bookRepository;

	public Book findBook(@PathVariable("id") Long id) {
		return bookRepository.findById(id);
	}
	
	public void setBookRepository(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	@Override
	public List<Book> getAllBooks() {
		return bookRepository.findAll();
	}
}
