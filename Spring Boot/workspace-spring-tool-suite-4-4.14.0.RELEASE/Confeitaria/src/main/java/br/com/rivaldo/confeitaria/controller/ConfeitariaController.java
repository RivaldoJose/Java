package br.com.rivaldo.confeitaria.controller;

import java.util.List;
import java.util.Observable;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import br.com.rivaldo.confeitaria.domain.Categoria;
import br.com.rivaldo.confeitaria.domain.Confeitaria;
import br.com.rivaldo.confeitaria.ropository.ConfeitariaRepository;

@RestController
@RequestMapping("/api/confeitarias")
public class ConfeitariaController {
	@Autowired
	private ConfeitariaRepository confeitariaRepository;
	
	@GetMapping
	public List<Confeitaria> obterConfeitarias() {
		return confeitariaRepository.findAll();
	}
	
	@GetMapping("/{sysId}")
	public Confeitaria obterConfeitaria(@PathVariable Short sysId) {
		try {
			Optional<Confeitaria> confeitaria = confeitariaRepository.findById(sysId);
			
			return confeitaria.get();
		} catch (RuntimeException exception) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Confeitaria não encontrada.", exception);
		}
	}
	
	@PostMapping
	public Confeitaria criarConfeitaria(@RequestBody Confeitaria conf) {
		try {
			return confeitariaRepository.save(conf);
		} catch (RuntimeException e) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Aconteceu um erro." ,e);
		}
		
	}
	
	@PutMapping
	public Confeitaria atualizarConfeitaria(@RequestBody Confeitaria confeitaria) {
		try {
			return confeitariaRepository.save(confeitaria);
		} catch (RuntimeException e) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Aconteceu um erro." ,e);
		}
	}
	
	@DeleteMapping("/{sysId}")
	public Confeitaria deletarConfeitaria(@PathVariable Short sysId) {
		try {
			Optional<Confeitaria> confeitariaDeletada = confeitariaRepository.findById(sysId);
			confeitariaRepository.delete(confeitariaDeletada.get());
			return confeitariaDeletada.get();
			
		} catch (RuntimeException e) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Aconteceu um erro.", e);
		}
	}
}
