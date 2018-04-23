package br.cesed.unifacisa.si.bd2.entities;

//Livro só possui um autor
public class Livro {

	private long livroId;
	private String titulo;
	private String descricao;
	private String isbn;

	public Livro(long livroId, String titulo, String descricao, String isbn) {
		super();
		this.livroId = livroId;
		this.titulo = titulo;
		this.descricao = descricao;
		this.isbn = isbn;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public void setLivroId(long livroId) {
		this.livroId = livroId;
	}

	public Livro() {
		// TODO Auto-generated constructor stub
	}

	public long getLivroId() {
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
