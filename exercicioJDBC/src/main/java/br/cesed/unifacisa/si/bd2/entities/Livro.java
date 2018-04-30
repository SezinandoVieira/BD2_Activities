package br.cesed.unifacisa.si.bd2.entities;

//Livro só possui um autor
public class Livro {

	private int livroId;
	private String titulo;
	private String descricao;
	private String isbn;
	private Editora editora;

	public Livro(int livroId, String titulo, String descricao, String isbn, Editora editora) {
		super();
		this.livroId = livroId;
		this.titulo = titulo;
		this.descricao = descricao;
		this.isbn = isbn;
		this.editora = editora;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public void setLivroId(int livroId) {
		this.livroId = livroId;
	}

	public long getLivroId() {
		return livroId;
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

	public Editora getEditora() {
		return editora;
	}

	public void setEditora(Editora editoras) {
		this.editora = editoras;
	}

}
