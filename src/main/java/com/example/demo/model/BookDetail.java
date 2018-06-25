package com.example.demo.model;

import javax.persistence.*;

@Entity
public class BookDetail {

   private long id;
   private int noofPages;

   private Book book;

    public BookDetail() {
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getNoofPages() {
        return noofPages;
    }

    public void setNoofPages(int noofPages) {
        this.noofPages = noofPages;
    }

    @OneToOne(mappedBy = "bookDetail")
    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "BookDetail{" +
                "id=" + id +
                ", noofPages=" + noofPages +
                ", book=" + book +
                '}';
    }
}
