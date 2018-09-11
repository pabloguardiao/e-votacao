package br.com.guardiaosistemas.evotacaospring.entity;

public class ResultadoChapa {
	private int ordem;
	private String descricaoChapa;
	private String selecaoChapa;
	private String fotoCandidato;
	private String nomeCandidato;
	private int qtdVotoSim;
	private int qtdVotoNao;
	
	public ResultadoChapa(int ordem, String descricaoChapa, String fotoCandidato, String nomeCandidato, String selecaoChapa, int qtdVotoSim, int qtdVotoNao) {
		super();
		this.ordem = ordem;
		this.descricaoChapa = descricaoChapa;
		this.selecaoChapa = selecaoChapa;
		this.fotoCandidato = fotoCandidato;
		this.nomeCandidato = nomeCandidato;
		this.qtdVotoSim = qtdVotoSim;
		this.qtdVotoNao = qtdVotoNao;
	}

	public int getOrdem() {
		return ordem;
	}

	public void setOrdem(int ordem) {
		this.ordem = ordem;
	}

	public String getSelecaoChapa() {
		return selecaoChapa;
	}

	public void setSelecaoChapa(String selecaoChapa) {
		this.selecaoChapa = selecaoChapa;
	}

	public String getFotoCandidato() {
		return fotoCandidato;
	}

	public void setFotoCandidato(String fotoCandidato) {
		this.fotoCandidato = fotoCandidato;
	}

	public String getDescricaoChapa() {
		return descricaoChapa;
	}

	public void setDescricaoChapa(String descricaoChapa) {
		this.descricaoChapa = descricaoChapa;
	}

	public String getNomeCandidato() {
		return nomeCandidato;
	}

	public void setNomeCandidato(String nomeCandidato) {
		this.nomeCandidato = nomeCandidato;
	}

	public int getQtdVotoSim() {
		return qtdVotoSim;
	}

	public void setQtdVotoSim(int qtdVotoSim) {
		this.qtdVotoSim = qtdVotoSim;
	}

	public int getQtdVotoNao() {
		return qtdVotoNao;
	}

	public void setQtdVotoNao(int qtdVotoNao) {
		this.qtdVotoNao = qtdVotoNao;
	}
	
	
}

