package com.example.bookSale.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bookSale.entity.BookEntity;

public interface BookRepository extends JpaRepository<BookEntity, Long> {

}
