package com.lib.model;

public class Book {
    private String title;
    private String author;
    private String Isbn;
    private int rating;

    public Book() {}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return Isbn;
    }

    public void setIsbn(String isbn) {
        Isbn = isbn;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String toString() {
        return "Book [title=" + title + ", author=" + author + ", Isbn=" + Isbn + ", rating=" + rating + "]"+"\n";
    }
}
