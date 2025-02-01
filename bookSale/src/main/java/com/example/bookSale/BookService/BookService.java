package com.example.bookSale.BookService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bookSale.Repository.BookRepository;
import com.example.bookSale.entity.BookEntity;



@Service
public class BookService {
	@Autowired
BookRepository bookRepository;
	public List<BookEntity> findAll(){
		return bookRepository.findAll();
		
	}
	public Optional<BookEntity> findById(Long id) {
		return bookRepository.findById(id);
	}
	public void saveBook(BookEntity bookentity) {
		bookRepository.save(bookentity);
	}
}
