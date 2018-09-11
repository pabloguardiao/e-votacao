package br.com.guardiaosistemas.evotacaospring.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Eleitor {
    public static final String GERAL = "G";
    public static final String JOVEM = "J";
    public static final String ADULTO = "A";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
//    private String codigo;
    private String nome;
    private String tipo = GERAL;
    private int andamento;    
    
    public Eleitor(){
    	super();
    }
    
	public Eleitor(String nome, String tipo) {
		super();
//		this.codigo = codigo;
		this.nome = nome;
		this.tipo = tipo;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
//	public String getCodigo() {
//		return codigo;
//	}
//	public void setCodigo(String codigo) {
//		this.codigo = codigo;
//	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getAndamento() {
		return andamento;
	}

	public void setAndamento(int andamento) {
		this.andamento = andamento;
	}
}
