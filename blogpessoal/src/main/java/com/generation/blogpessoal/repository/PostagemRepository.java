package com.generation.blogpessoal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.blogpessoal.model.Postagem;

//JPA possibilita a comunicação da repository com o banco de dados
public interface PostagemRepository extends JpaRepository <Postagem, Long> {

}
