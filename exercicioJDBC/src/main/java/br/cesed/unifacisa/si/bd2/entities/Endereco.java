package br.cesed.unifacisa.si.bd2.entities;

public class Endereco {

	private long enderecoId;
	private String rua;
	private String bairro;
	private String cidade;
	private String estado;
	private String cep;
	private int numero;

	public Endereco(long enderecoId, String rua, String bairro, String cidade, String estado, String cep, int numero) {
		super();
		this.enderecoId = enderecoId;
		this.rua = rua;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
		this.numero = numero;
	}

	public long getEnderecoId() {
		return enderecoId;
	}

	public void setEnderecoId(long enderecoId) {
		this.enderecoId = enderecoId;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	

}
