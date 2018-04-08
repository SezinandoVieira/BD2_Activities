package br.cesed.unifacisa.si.bd2.ltiproject.exceptions;

public class PeriodoException extends Exception {

	private static final long serialVersionUID = 1L;

	public PeriodoException() {
		super("O aluno não está em um periodo valido para se cadastra à um projeto");
	}

}
