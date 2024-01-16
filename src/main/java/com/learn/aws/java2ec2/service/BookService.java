package com.learn.aws.java2ec2.service;

import com.learn.aws.java2ec2.model.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    private static Integer i = 0;
    private static List<Book> allBooks = new ArrayList<>();

    static {
        allBooks.add(new Book(i++, "O Senhor dos Anéis - A Sociedade do Anel", "Tolkien"));
        allBooks.add(new Book(i++, "O Senhor dos Anéis - As Duas Torres", "Tolkien"));
        allBooks.add(new Book(i++, "O Senhor dos Anéis - O Retorno do Rei", "Tolkien"));
    }

    public List<Book> returnAllBooks(){
        return allBooks;
    }
}
