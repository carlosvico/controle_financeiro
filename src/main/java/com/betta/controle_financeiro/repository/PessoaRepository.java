package com.betta.controle_financeiro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.betta.controle_financeiro.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
