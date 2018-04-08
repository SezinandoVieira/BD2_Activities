package br.cesed.unifacisa.si.bd2.ltiproject.factories;

import br.cesed.unifacisa.si.bd2.ltiproject.entities.Professor;

public class ProfessorFactory {

	public static Professor criaInstancia(String nome, int matricula) {
		return new Professor(nome, matricula);
	}

	

}
