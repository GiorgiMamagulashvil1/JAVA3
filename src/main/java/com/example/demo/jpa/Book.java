package com.example.demo.jpa;

import com.example.demo.dtos.BookDto;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString
@RequiredArgsConstructor
@Table(name = "Books")
@Entity
public class Book extends BaseEntity {

    @Id
    @Column(name = "Id", nullable = false)
    @SequenceGenerator(name = "BookSeqId", sequenceName = "BOOK_SEQ_GEN", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "BookSeqId")
    private Long id;

    @Column(name = "Name")
    private String name;

    @Column(name = "Pages")
    private Integer pages;

    @Column(name = "Genre")
    private String genre;

    public Book(BookDto bookDto) {
        if (bookDto != null) {
            this.genre = bookDto.getGenre();
            this.name = bookDto.getName();
            this.pages = bookDto.getPages();
        }
    }

}