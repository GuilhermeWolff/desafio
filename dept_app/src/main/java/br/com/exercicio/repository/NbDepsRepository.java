package br.com.exercicio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.exercicio.model.NbDeps;

@Repository
public interface NbDepsRepository extends JpaRepository<NbDeps, Long> {
}