package com.betta.controle_financeiro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.JpaRepositoryConfigExtension;

import com.betta.controle_financeiro.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

}
