package br.cesed.unifacisa.si.bd2.ltiproject.exceptions;

public class TecnologiaInsuficienteException extends Exception{

	private static final long serialVersionUID = 3L;
	
	public TecnologiaInsuficienteException(){
		super("Você tem que utilizar pelo menos uma tecnologia");
	}

}
