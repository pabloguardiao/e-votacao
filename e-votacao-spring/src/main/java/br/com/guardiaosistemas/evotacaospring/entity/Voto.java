package br.com.guardiaosistemas.evotacaospring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Voto {
	
	public static final String SIM = "S"; // voto confirmado ou positivo para chapa de confirmação
	public static final String NAO = "N"; // voto negativo usado somente na chapa de confirmação
	public static final String BRANCO = "B"; // voto de abstenção (não quis votar)
	public static final String NULO = "L"; // voto
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
//	private Long idChapa;
	@Column(name="id_eleitor")
	private Long idEleitor;
	@Column(name="id_candidato")
	private Long idCandidato;
	private String opcao; // (usado apenas para casos de confirmação) S=Sim / N=Não  
		
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
//	public Long getIdChapa() {
//		return idChapa;
//	}
//	public void setIdChapa(Long idChapa) {
//		this.idChapa = idChapa;
//	}
	public Long getIdEleitor() {
		return idEleitor;
	}
	public void setIdEleitor(Long idEleitor) {
		this.idEleitor = idEleitor;
	}
	public Long getIdCandidato() {
		return idCandidato;
	}
	public void setIdCandidato(Long idCandidato) {
		this.idCandidato = idCandidato;
	}
	public String getOpcao() {
		return opcao;
	}
	public void setOpcao(String opcao) {
		this.opcao = opcao;
	}
}
