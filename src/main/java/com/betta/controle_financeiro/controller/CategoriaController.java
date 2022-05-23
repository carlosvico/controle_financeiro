package com.betta.controle_financeiro.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.betta.controle_financeiro.model.Categoria;
import com.betta.controle_financeiro.repository.CategoriaRepository;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {
	
	@Autowired
	private CategoriaRepository repository;
	
	
	//	==========  LISTAR TODAS AS CATEGORIAS ============
	@GetMapping
	public List<Categoria> listar(){
		return repository.findAll();
	}

	
	//	==========  CADASTRAR CATEGORIAS ============
	@PostMapping
	public ResponseEntity<Categoria> criar(@Valid @RequestBody Categoria entity, HttpServletResponse response) {
		Categoria categoria = repository.save(entity);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{id}")
		.buildAndExpand(categoria.getId()).toUri();
		response.setHeader("Location", uri.toASCIIString());
		
		return ResponseEntity.created(uri).body(categoria);
				}

	
	//	==========  ENCONTRAR CATEGORIAS POR ID ============ 
	@GetMapping("/{id}")
	public ResponseEntity<?> buscaPorId(@PathVariable Long id) {
		Optional<Categoria> categoria = repository.findById(id);
		return !categoria.isEmpty() ? ResponseEntity.ok(categoria):ResponseEntity.noContent().build(); 
		
	}


}
