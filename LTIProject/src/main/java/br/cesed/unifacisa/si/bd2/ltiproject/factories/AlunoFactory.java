package br.cesed.unifacisa.si.bd2.ltiproject.factories;

import br.cesed.unifacisa.si.bd2.ltiproject.entities.Aluno;
import br.cesed.unifacisa.si.bd2.ltiproject.exceptions.PeriodoInvalidoException;

public class AlunoFactory {

	public static Aluno criaInstancia(String nome, int matricula, int periodo) throws PeriodoInvalidoException {
		if (periodo < 4){
			throw new PeriodoInvalidoException();
		}
		return new Aluno(nome, matricula, periodo);
	}

}
