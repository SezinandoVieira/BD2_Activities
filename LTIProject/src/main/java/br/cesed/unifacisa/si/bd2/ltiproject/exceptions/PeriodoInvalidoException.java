package br.cesed.unifacisa.si.bd2.ltiproject.exceptions;

public class PeriodoInvalidoException extends Exception {

	private static final long serialVersionUID = 1L;

	public PeriodoInvalidoException() {
		super("O aluno não está em um periodo valido para se cadastra à um projeto");
	}

}
