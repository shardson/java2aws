package com.learn.aws.java2ec2.model;

public class Book {

    private Integer Id;
    private String Name;
    private String Author;

    public Book(Integer id, String name, String author) {
        Id = id;
        Name = name;
        Author = author;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }
}
