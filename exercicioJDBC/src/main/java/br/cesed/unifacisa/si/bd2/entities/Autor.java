package br.cesed.unifacisa.si.bd2.entities;

public class Autor {

	private int idAutor;
	private String nome;
	private String email;

	public Autor(String nome, String email, int idAutor) {
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

	public void setIdAutor(int idAutor) {
		this.idAutor = idAutor;
	}
	
	

}
