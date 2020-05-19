package com.cg.project.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.project.onlinebookstore.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
