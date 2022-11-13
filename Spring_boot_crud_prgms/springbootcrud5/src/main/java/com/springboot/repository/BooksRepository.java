package com.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springboot.Model.Books;

//repository that extends CrudRepository  



public interface BooksRepository extends JpaRepository<Books, Integer> {
}