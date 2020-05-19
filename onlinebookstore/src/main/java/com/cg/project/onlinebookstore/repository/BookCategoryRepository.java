package com.cg.project.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.project.onlinebookstore.entity.BookCategory;

public interface BookCategoryRepository extends JpaRepository<BookCategory, Long> {

}
