package com.leocavalhere.restproject.repository;

import com.leocavalhere.restproject.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {}