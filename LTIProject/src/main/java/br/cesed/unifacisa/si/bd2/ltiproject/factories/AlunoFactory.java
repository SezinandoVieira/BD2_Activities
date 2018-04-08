package br.cesed.unifacisa.si.bd2.ltiproject.factories;

import br.cesed.unifacisa.si.bd2.ltiproject.entities.Aluno;

public class AlunoFactory {

	public static Aluno criaInstancia(String nome, int matricula, int periodo) {
		if (periodo < 4){
			
		}
		return new Aluno(nome, matricula, periodo);
	}

}
