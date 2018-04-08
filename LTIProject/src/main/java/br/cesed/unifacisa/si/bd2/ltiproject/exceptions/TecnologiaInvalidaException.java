package br.cesed.unifacisa.si.bd2.ltiproject.exceptions;

public class TecnologiaInvalidaException extends Exception{

	private static final long serialVersionUID = 5L;

	public TecnologiaInvalidaException(){
		super("Esta tecnologia que voce esta tentando utilizar é inválida");
	}
}
