package br.com.guardiaosistemas.evotacaospring.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Chapa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	@JoinColumn(name="id_eleicao")
	private Eleicao eleicao;
	private String descricao;
    private String tipo = "G"; // G=GERAL, J=JOVENS, A=ADULTOS
    private String selecao = "U"; // U=Voto Único, M=Voto múltiplo, C=Candidato para confirmação
	private int ordem;

	@OneToMany(mappedBy = "chapa", targetEntity = Candidato.class, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Candidato> candidatos = new ArrayList<Candidato>();
	
	public Chapa() {
		super();
	}
	
	public Chapa(Eleicao eleicao, String descricao, String tipo, String selecao, int ordem) {
		super();
		this.eleicao = eleicao;
		this.descricao = descricao;
		this.tipo = tipo;
		this.selecao = selecao;
		this.ordem = ordem;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getSelecao() {
		return selecao;
	}

	public void setSelecao(String selecao) {
		this.selecao = selecao;
	}

	public int getOrdem() {
		return ordem;
	}
	public void setOrdem(int ordem) {
		this.ordem = ordem;
	}
	public List<Candidato> getCandidatos() {
		return candidatos;
	}
	public void setCandidatos(List<Candidato> candidatos) {
		this.candidatos = candidatos;
	}
	public Eleicao getEleicao() {
		return eleicao;
	}
	public void setEleicao(Eleicao eleicao) {
		this.eleicao = eleicao;
	}
}
