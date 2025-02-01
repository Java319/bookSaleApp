package com.example.bookSale.BookService.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.bookSale.BookService.BookService;
import com.example.bookSale.entity.BookEntity;

@RestController
@RequestMapping("/books")
public class BookController {
	  @Autowired  
    private  BookService bookService;

  
  

    @GetMapping("/get-all")
    public List<BookEntity> findAll() {
        return bookService.findAll();
    }

    @GetMapping("/{id}") 
    public Optional<BookEntity> findBookById(@PathVariable Long id) {
        return bookService.findById(id);
    }

    @PostMapping("/add")
    public void saveAllBooks(@RequestBody BookEntity bookEntity) {
        bookService.saveBook(bookEntity);
    }
}