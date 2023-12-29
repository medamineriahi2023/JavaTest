package com.oga;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        BookRepository bookRepository = new BookRepository();
        List<Book> books;
        Library library = new LibraryManagementSystem(bookRepository) ;


        ObjectMapper mapper = new ObjectMapper();
        File booksJson = new File("src/test/resources/books.json");
        books = mapper.readValue(booksJson, new TypeReference<List<Book>>() {
        });
        bookRepository.addBooks(books);

        // tsalf kteb mawjoud
            Member member = new StudentMember("Y2037978P", "Amine", "Riahi", 20.0f, Profil.STUDENT);
            Book book = library.borrowBook(46578964513L, member, LocalDate.now());
        System.out.println("book found : " +book);
        System.out.println("**********************************************************");



//        // n3awdou netsalfou nafs lkteb marra okhra men membre wehed ekher
//        Member member2 = new StudentMember("TR56553D", "Yassine", "Abdellaoui", 30.0f, Profil.RESIDENT);
//        Book bookNotAvailable = library.borrowBook(46578964513L, member2, LocalDate.now());
//        System.out.println("book not found : " +bookNotAvailable);
//        System.out.println("**********************************************************");

//// les residents yekhdhou taxes b 10 cents kol maykhaliw lkteb aand'hom nhar zeid
//        Member member3 = new ResidentMember("Y2037978P", "Amine", "Riahi", 20.0f, Profil.RESIDENT);
//        LocalDate dateBorrowed = LocalDate.now().minusDays(10);
//        Book book1 = library.borrowBook(46578964513L, member3, dateBorrowed);
//        library.returnBook(book1, member3);
//        System.out.println(member3.getWallet());
//        System.out.println("**********************************************************");

//// les etudiant ykhalsou 10 cents f 30 youm loulenin
//        Member member4 = new StudentMember("Y2037978P", "Amine", "Riahi", 20.0f, Profil.STUDENT);
//        LocalDate dateBorrowed = LocalDate.now().minus(30, ChronoUnit.DAYS);
//        Book book = library.borrowBook(46578964513L, member4, dateBorrowed);
//        library.returnBook(book, member4);
//        System.out.println(member4.getWallet());
//        System.out.println("**********************************************************");

////     les etudiants fl 3am louel ma3and'homch taxes f 15 youm loulenin
//        Member member5 = new StudentMember("Y2037978P", "Amine", "Riahi", 20.0f, Profil.STUDENT_1ST_YEAR);
//        LocalDate dateBorrowed = LocalDate.now().minus(27, ChronoUnit.DAYS);
//        Book book = library.borrowBook(46578964513L, member5, dateBorrowed);
//        library.returnBook(book, member5);
//        System.out.println(member5.getWallet());
//        System.out.println("**********************************************************");

//        // les residents ykhalsou 20 cents lkol youm ykhaliw aand'hom kteb 9bal initial 60 youm
//        Member member6 = new ResidentMember("Y2037978P", "Amine", "Riahi", 20.0f, Profil.RESIDENT);
//        member6.payBook(65);
//        System.out.println(member6.getWallet());

//        // manajmouch nekhdhou kteb mouleh mezel maraj3ouch
//        Member member7 = new ResidentMember("Y2037978P", "Amine", "Riahi", 20.0f, Profil.STUDENT);
//        LocalDate dateBorrowed = LocalDate.now().minus(31, ChronoUnit.DAYS);
//        Book book1 = library.borrowBook(46578964513L, member7, dateBorrowed);
//        System.out.println(book1);



    }
}