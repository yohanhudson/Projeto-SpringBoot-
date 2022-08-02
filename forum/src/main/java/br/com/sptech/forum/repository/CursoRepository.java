package br.com.sptech.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sptech.forum.modelo.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {
	
	Curso findByNome(String nomeCurso);
	
}
