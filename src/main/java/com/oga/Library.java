package com.oga;

import java.time.LocalDate;

public interface Library {

    Book borrowBook(long isbnCode, Member member, LocalDate borrowedAt) throws HasLateBooksException;

    void returnBook(Book book, Member member);

}
