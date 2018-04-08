package br.cesed.unifacisa.si.bd2.ltiproject.exceptions;

public class ProfessorInProjetoException extends Exception {

	private static final long serialVersionUID = 2L;
	
	public ProfessorInProjetoException(){
		super("O professor já está em um projeto");
	}

}
