package br.cesed.unifacisa.si.bd2.ltiproject.entities;

public class Professor {

	private Long id;
	private String nome;
	private int matricula;
	private boolean isInProjeto;

	public Professor(String nome, int matricula) {
		super();
		this.nome = nome;
		this.matricula = matricula;
	}
	
	public Professor(){
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

	public boolean isInProjeto() {
		return isInProjeto;
	}

	public void setInProjeto(boolean isInProjeto) {
		this.isInProjeto = isInProjeto;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	

}
