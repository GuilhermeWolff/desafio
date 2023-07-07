package br.com.exercicio.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.exercicio.model.Classe;
import br.com.exercicio.repository.ClasseRepository;

@Service
public class ClasseService {
	
	@Autowired private ClasseRepository repository;
	
	public List<Classe> getAllClass(){
		return repository.findAll();		
	}
	public Classe findById(Long dept) {
		Optional<Classe> op = repository.findById(dept);
		return op.get();
		}	
	public Classe findByClasse(Long classe) {
		return repository.findByClasse(classe);
	}
}