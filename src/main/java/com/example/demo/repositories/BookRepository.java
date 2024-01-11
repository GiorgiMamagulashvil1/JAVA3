package com.example.demo.repositories;

import com.example.demo.jpa.Book;
import com.example.demo.jpa.RecordState;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    //List<Book> findAllByRecordState(RecordState recordState);
}