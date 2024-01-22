package com.learn.aws.java2ec2.controller;

import com.learn.aws.java2ec2.model.Book;
import com.learn.aws.java2ec2.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping(value = "/books", method = RequestMethod.GET)
    public List<Book> getAllBooks(){
        return bookService.returnAllBooks();
    }

    @RequestMapping(value = "/addbook", method = RequestMethod.POST)
    public void addBook(@RequestBody Book book){
        bookService.addBook(book);
    }
}
