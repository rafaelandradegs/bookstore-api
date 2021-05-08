package com.rafael3.bookstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rafael3.bookstore.domain.Livro;

@Repository

public interface LivroRepository extends JpaRepository<Livro, Integer>{

}
