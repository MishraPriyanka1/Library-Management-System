package com.library_management.book.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library_management.book.models.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
