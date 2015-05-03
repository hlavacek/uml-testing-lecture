package com.accenture.ddc.sdj.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import com.accenture.ddc.sdj.entity.Book;

public interface BookRepository extends Repository<Book, Long> {

	Book findById(Long id);

	List<Book> findAll();
}
