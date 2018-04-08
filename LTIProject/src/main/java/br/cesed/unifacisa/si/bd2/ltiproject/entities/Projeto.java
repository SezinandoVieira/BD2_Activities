package br.cesed.unifacisa.si.bd2.ltiproject.entities;

import java.util.ArrayList;
import java.util.Date;

public class Projeto {

	private Long id;
	private String titulo;
	private String descricaoProjeto;
	private ArrayList<Aluno> alunos;
	private ArrayList<Tecnologia> tecnologia;
	private Professor professor;
	private Date dataInicio;
	private Date dataConclusao;
	private String areaRelacionada;

	public Projeto(String titulo, String descricaoProjeto, ArrayList<Aluno> alunos, ArrayList<Tecnologia> tecnologia,
			Professor professor, Date dataInicio, Date dataConclusao, String areaRelacionada) {
		super();
		this.titulo = titulo;
		this.descricaoProjeto = descricaoProjeto;
		this.alunos = alunos;
		this.tecnologia = tecnologia;
		this.professor = professor;
		this.dataInicio = dataInicio;
		this.dataConclusao = dataConclusao;
		this.areaRelacionada = areaRelacionada;
	}
	
	public Projeto() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricaoProjeto() {
		return descricaoProjeto;
	}

	public void setDescricaoProjeto(String descricaoProjeto) {
		this.descricaoProjeto = descricaoProjeto;
	}

	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(ArrayList<Aluno> alunos) {
		this.alunos = alunos;
	}

	public ArrayList<Tecnologia> getTecnologia() {
		return tecnologia;
	}

	public void setTecnologia(ArrayList<Tecnologia> tecnologia) {
		this.tecnologia = tecnologia;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataConclusao() {
		return dataConclusao;
	}

	public void setDataConclusao(Date dataConclusao) {
		this.dataConclusao = dataConclusao;
	}

	public String getAreaRelacionada() {
		return areaRelacionada;
	}

	public void setAreaRelacionada(String areaRelacionada) {
		this.areaRelacionada = areaRelacionada;
	}
	
	
	

}
