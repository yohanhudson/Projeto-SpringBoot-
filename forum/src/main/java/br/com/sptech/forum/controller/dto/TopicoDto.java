package br.com.sptech.forum.controller.dto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import br.com.sptech.forum.modelo.Topico;

public class TopicoDto {
	
	private Long id;
	private String titulo;
	private String mensagem;
	private LocalDateTime dataCriacao; 
	
	public TopicoDto(Topico topico) {
		this.id = topico.getId();
		this.titulo =topico.getTitulo();
		this.mensagem = topico.getMensagem();
		this.dataCriacao = topico.getDataCriacao();
	}

	
	public Long getId() {
		return id;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public String getMesagem() {
		return mensagem;
	}
	
	public LocalDateTime getDataXriacao() {
		return dataCriacao;
	}


	public static List<TopicoDto> converter(List<Topico> Topicos) {
		return Topicos.stream().map(TopicoDto::new).collect(Collectors.toList());
	}
}
