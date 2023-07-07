package br.com.exercicio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.exercicio.model.Deps;

@Repository
public interface DepsRepository extends JpaRepository<Deps, Long> {
}