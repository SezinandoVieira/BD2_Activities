package br.cesed.unifacisa.si.bd2.ltiproject.exceptions;

public class ProfessorInexistenteException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public ProfessorInexistenteException(){
		super("O professor que voce tentou adicionar não existe");
	}

}
