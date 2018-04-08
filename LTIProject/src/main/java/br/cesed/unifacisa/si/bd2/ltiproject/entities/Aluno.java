package br.cesed.unifacisa.si.bd2.ltiproject.entities;

public class Aluno {

	private Long id;
	private String nome;
	private int matricula;
	private int periodo;

	public Aluno(String nome, int matricula, int periodo) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.periodo = periodo;
	}

	public Aluno() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public int getPeriodo() {
		return periodo;
	}

	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
