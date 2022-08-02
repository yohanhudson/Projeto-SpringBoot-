package br.com.sptech.forum.controller.form;


import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import br.com.sptech.forum.modelo.Curso;
import br.com.sptech.forum.modelo.Topico;
import br.com.sptech.forum.repository.CursoRepository;

public class TopicoForm {

	@NotNull @NotEmpty @Length(min = 5)
	private String titulo;
	@NotNull @NotEmpty @Length(min = 10)
	private String mensagem;
	@NotNull @NotEmpty
	private String nomeCurso;
	
	
	private String getTitulo() {
	    return titulo;
	}
	
	private void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getMensagem() {
		return mensagem;
	}
	
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
	public String getNomeCurso(){
		return nomeCurso;
	}
	
	public void setNomeCurso(String nomecurso) {
		this.nomeCurso = nomecurso;
	}

	public Topico converter(CursoRepository cursoRepository) {
		Curso curso = cursoRepository.findByNome(nomeCurso);
		return new Topico(titulo, mensagem, curso);
	}
}
