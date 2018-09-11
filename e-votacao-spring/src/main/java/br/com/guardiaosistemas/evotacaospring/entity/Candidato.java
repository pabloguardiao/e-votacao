package br.com.guardiaosistemas.evotacaospring.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Candidato {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String foto;
	@ManyToOne
	@JoinColumn(name="id_chapa")
	private Chapa chapa;

	public Candidato() {
		super();
	}
	
	public Candidato(Chapa chapa, String nome, String foto) {
		super();
		this.nome = nome;
		this.foto = foto;
		this.chapa= chapa;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
}
