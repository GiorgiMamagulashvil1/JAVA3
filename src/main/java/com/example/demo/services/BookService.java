package com.example.demo.services;

import com.example.demo.dtos.BookDto;
import com.example.demo.jpa.Book;
import com.example.demo.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    private final BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book addBook(BookDto bookDto){
        Book book = new Book(bookDto);
        return bookRepository.save(book);

    }


}
