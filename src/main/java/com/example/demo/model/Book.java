package com.example.demo.model;

import javax.persistence.*;

@Entity
public class Book {

    private Long id;
    private String bookName;
    private BookDetail bookDetail;

    public Book() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name ="book_detail_id")
    public BookDetail getBookDetail() {
        return bookDetail;
    }

    public void setBookDetail(BookDetail bookDetail) {
        this.bookDetail = bookDetail;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", bookDetail=" + bookDetail +
                '}';
    }
}
