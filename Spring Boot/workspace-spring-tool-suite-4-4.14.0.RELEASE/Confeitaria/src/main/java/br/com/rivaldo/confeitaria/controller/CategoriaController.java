package br.com.rivaldo.confeitaria.controller;

import java.lang.System.Logger;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import br.com.rivaldo.confeitaria.domain.Categoria;
import br.com.rivaldo.confeitaria.ropository.CategoriaRepository;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j;

@RestController
@RequestMapping("/api/categorias")
public class CategoriaController {
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@GetMapping
	public List<Categoria> listar() {
		return categoriaRepository.findAll();
	}
	
	@GetMapping("/{codigo}")
	public Categoria obterCategoria(@PathVariable Short codigo) throws Exception {
		try {
			Optional<Categoria> categoria = categoriaRepository.findById(codigo);
			return categoria.get();
		} catch (RuntimeException e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Categoria não encontrada.", e);
		}
	}
	
	@PostMapping
	public Categoria inserir(@RequestBody Categoria categoria) {
		return categoriaRepository.save(categoria);
	}
	
	@PutMapping
	public Categoria atualizarCategoria(@RequestBody Categoria categoria) {
		try {
			Optional<Categoria> categoriaAtualizada = categoriaRepository.findById(categoria.getCodigo());
			
			if (categoriaAtualizada.isEmpty()) {
				throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Categoria não encontrada.");
			}
			
			categoriaRepository.save(categoria);
			return categoria;
		} catch (RuntimeException exception) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Categoria não encontrada.", exception);
		}
	}
	
	@DeleteMapping("/{codigo}")
	public Categoria deletarCategoria(@PathVariable Short codigo) {
		try {
			Optional<Categoria> categoriaRemovida = categoriaRepository.findById(codigo);
			
			if (categoriaRemovida.isPresent()) {
				categoriaRepository.delete(categoriaRemovida.get());
			}
			
			return categoriaRemovida.get();
		} catch (RuntimeException exception) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Categoria não encontrada.", exception);
		}
	}
}
