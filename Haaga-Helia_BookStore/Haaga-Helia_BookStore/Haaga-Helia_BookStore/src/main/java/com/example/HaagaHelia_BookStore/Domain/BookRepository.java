package com.example.HaagaHelia_BookStore.Domain;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepository extends CrudRepository<Book, Long> {
    List<Book> findByTitleContainingIgnoreCaseOrAuthorContainingIgnoreCase(String title, String author);

    List<Book> findAllByOrderByAuthorAsc();

    List<Book> findAllByOrderByAuthorDesc();

    List<Book> findAllByOrderByTitleAsc();

    List<Book> findAllByOrderByTitleDesc();

}