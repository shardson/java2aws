package com.learn.aws.java2ec2.repository;

import com.learn.aws.java2ec2.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
