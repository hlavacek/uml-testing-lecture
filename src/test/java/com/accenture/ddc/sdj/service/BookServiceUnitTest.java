package com.accenture.ddc.sdj.service;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

import com.accenture.ddc.sdj.entity.Book;
import com.accenture.ddc.sdj.repository.BookRepository;
import com.accenture.ddc.sdj.repository.BookRepositoryStub;
import com.accenture.ddc.sdj.service.impl.BookServiceImpl;

public class BookServiceUnitTest {
	

	@Test
	public void shouldFindBook() {
		BookServiceImpl bookService = new BookServiceImpl();
		BookRepositoryStub bookRepository = new BookRepositoryStub();
		bookService.setBookRepository(bookRepository);
		
		Book sampleBook = new Book();
		sampleBook.setName("Lord of the rings.");
		
		bookRepository.setBooks(Arrays.asList(sampleBook));
		
		Book book = bookService.findBook(0l);
		
		Assert.assertEquals(sampleBook, book);
	}
}
