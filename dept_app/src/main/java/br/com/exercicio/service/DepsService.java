package br.com.exercicio.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.exercicio.model.Deps;
import br.com.exercicio.repository.DepsRepository;

@Service
public class DepsService {
			
	@Autowired private DepsRepository repository;
		
	public List<Deps> getAllDeps() {
		return repository.findAll();		
	}
	public Deps findById(Long dept) {
		Optional<Deps> op =	repository.findById(dept);
		return op.get();
	}
}