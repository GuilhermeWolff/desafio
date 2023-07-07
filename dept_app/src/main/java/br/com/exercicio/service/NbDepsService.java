package br.com.exercicio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.exercicio.model.NbDeps;
import br.com.exercicio.repository.NbDepsRepository;

@Service
public class NbDepsService {

	@Autowired
	private NbDepsRepository repository;
	
	//Salvar os dados inseridos
public NbDeps nbSaveDeps(NbDeps dept) {
	return repository.save(dept);	
	}
	
	//Procurar dados pelo ID
public NbDeps nbFindById(Long id) {
	return repository.findById(id).orElse(null);
	}

	//Deletar dados pelo ID
public void nbDeleteById(Long id) {
	if(repository.existsById(id)) {
		repository.deleteById(id);
    }
  }
}