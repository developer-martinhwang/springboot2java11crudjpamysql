package com.martinhwang.springboot2java11crudjpamysql.repository;

import com.martinhwang.springboot2java11crudjpamysql.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
}
