package br.com.exercicio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.exercicio.model.Deps;
import br.com.exercicio.service.DepsService;

@RestController
@RequestMapping(value = "/deps")
public class DepsController {

	@Autowired
	private DepsService service;

	@GetMapping(value = "/all")
	public List<Deps> allDeps() {
		return service.getAllDeps();
	}

	@GetMapping(value = "/{dept}")
	public Deps getDepsById(@PathVariable Long dept) {
		return service.findById(dept);
	}
}