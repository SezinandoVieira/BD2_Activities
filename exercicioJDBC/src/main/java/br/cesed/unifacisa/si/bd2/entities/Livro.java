package br.cesed.unifacisa.si.bd2.entities;

public class Livro {

	private int livroId;
	private String titulo;
	private String descricao;

	public Livro(int livroId, String titulo, String descricao) {
		super();
		this.livroId = livroId;
		this.titulo = titulo;
		this.descricao = descricao;
	}

	public int getLivroId() {
		return livroId;
	}

	public void setLivroId(int livroId) {
		this.livroId = livroId;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	

}
