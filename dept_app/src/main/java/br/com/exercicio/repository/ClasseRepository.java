package br.com.exercicio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.exercicio.model.Classe;

@Repository
public interface ClasseRepository extends JpaRepository<Classe, Long> {
	Classe findByClasse (Long classe);
}