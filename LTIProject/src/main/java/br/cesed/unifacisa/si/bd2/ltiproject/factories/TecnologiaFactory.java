package br.cesed.unifacisa.si.bd2.ltiproject.factories;

import br.cesed.unifacisa.si.bd2.ltiproject.entities.Tecnologia;

public class TecnologiaFactory {

	public static Tecnologia criaInstancia(String nome, String descricao, String documentacao, String referencia) {
		
		return new Tecnologia(nome, descricao, documentacao, referencia);
	}

}
