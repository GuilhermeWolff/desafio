package br.com.exercicio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.exercicio.model.Classe;
import br.com.exercicio.service.ClasseService;

@RestController
@RequestMapping(value = "/class")
public class ClasseController {
	
	@Autowired private ClasseService service;
	
	@GetMapping(value = "/all")
	public List<Classe> allClass() {
		return service.getAllClass();
	}
	@GetMapping(value = ("/{dept}"))
	public Classe getById(@PathVariable Long dept) {
		return service.findById(dept);
	}
	@GetMapping(value = ("/{dept}/{classe}"))
	public Classe getByClass(@PathVariable Long classe) {
		return service.findByClasse(classe) ;
	}
}