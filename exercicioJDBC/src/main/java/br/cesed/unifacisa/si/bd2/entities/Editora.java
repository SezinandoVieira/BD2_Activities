package br.cesed.unifacisa.si.bd2.entities;

public class Editora {

	private long idEditora;
	private String nome;
	private String cnpj;
	private Endereco endereco;

	public Editora(long idEditora, String nome, String cnpj, Endereco endereco) {
		super();
		this.idEditora = idEditora;
		this.nome = nome;
		this.cnpj = cnpj;
		this.endereco = endereco;
	}

	public long getIdEditora() {
		return idEditora;
	}

	public void setIdEditora(long idEditora) {
		this.idEditora = idEditora;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	

}
