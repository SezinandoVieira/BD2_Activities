package br.cesed.unifacisa.si.bd2.ltiproject.exceptions;

public class AlunoInexistenteException extends Exception {

	private static final long serialVersionUID = 4L;
	
	public AlunoInexistenteException(){
		super("Este aluno que voce tentou adicionar não existe");
	}

}
