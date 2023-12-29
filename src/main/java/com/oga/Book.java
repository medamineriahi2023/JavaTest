package com.oga;

import java.util.Objects;

public class Book {
    String title;
    String author;
    ISBN isbn;

    public Book() {}

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public ISBN getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn=" + isbn +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        boolean result = false;
        if(o instanceof Book) {
            Book book = (Book) o;
            result = Objects.equals(title, book.title) &&
                    Objects.equals(author, book.author) &&
                    Objects.equals(isbn, book.isbn);
        }
        return result;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, isbn);
    }
}