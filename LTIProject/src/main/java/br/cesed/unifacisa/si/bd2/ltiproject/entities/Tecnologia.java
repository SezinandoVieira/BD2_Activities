package br.cesed.unifacisa.si.bd2.ltiproject.entities;

public class Tecnologia {

	private Long id;
	private String nome;
	private String descricao;
	private String documentacao;
	private String referencia;

	public Tecnologia(String nome, String descricao, String documentacao, String referencia) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.documentacao = documentacao;
		this.referencia = referencia;
	}
	
	public Tecnologia () {
		super();
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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDocumentacao() {
		return documentacao;
	}

	public void setDocumentacao(String documentacao) {
		this.documentacao = documentacao;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	
	

}
