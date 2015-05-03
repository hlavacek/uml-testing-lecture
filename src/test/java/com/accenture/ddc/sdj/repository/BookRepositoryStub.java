package com.accenture.ddc.sdj.repository;

import java.util.ArrayList;
import java.util.List;

import com.accenture.ddc.sdj.entity.Book;

public class BookRepositoryStub implements BookRepository {

	private List<Book> books = new ArrayList<Book>();
	
	@Override
	public Book findById(Long id) {
		return books.get(Long.valueOf(id).intValue());
	}
	
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	@Override
	public List<Book> findAll() {
		return books;
	}

}
