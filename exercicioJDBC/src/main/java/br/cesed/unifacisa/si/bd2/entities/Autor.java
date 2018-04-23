package br.cesed.unifacisa.si.bd2.entities;

public class Autor {

	private long idAutor;
	private String nome;
	private String email;

	public Autor(String nome, String email, long idAutor) {
		super();
		this.nome = nome;
		this.email = email;
		this.idAutor = idAutor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getIdAutor() {
		return idAutor;
	}

	public void setIdAutor(long idAutor) {
		this.idAutor = idAutor;
	}
	
	

}
