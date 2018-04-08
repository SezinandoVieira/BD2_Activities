package br.cesed.unifacisa.si.bd2.ltiproject.factories;

import java.util.ArrayList;
import java.util.Date;

import br.cesed.unifacisa.si.bd2.ltiproject.entities.Aluno;
import br.cesed.unifacisa.si.bd2.ltiproject.entities.Professor;
import br.cesed.unifacisa.si.bd2.ltiproject.entities.Projeto;
import br.cesed.unifacisa.si.bd2.ltiproject.entities.Tecnologia;
import br.cesed.unifacisa.si.bd2.ltiproject.exceptions.AlunoInexistenteException;
import br.cesed.unifacisa.si.bd2.ltiproject.exceptions.ProfessorInProjetoException;
import br.cesed.unifacisa.si.bd2.ltiproject.exceptions.ProfessorInexistenteException;
import br.cesed.unifacisa.si.bd2.ltiproject.exceptions.TecnologiaInsuficienteException;
import br.cesed.unifacisa.si.bd2.ltiproject.exceptions.TecnologiaInvalidaException;

public class ProjetoFactory {

	public static Projeto criaInstancia(String titulo, String descricaoProjeto, ArrayList<Aluno> alunos, 
			ArrayList<Tecnologia> tecnologias, Professor professor, Date dataInicio, Date dataConclusao, String areaRelacionada) throws TecnologiaInsuficienteException, ProfessorInProjetoException, TecnologiaInvalidaException, AlunoInexistenteException, ProfessorInexistenteException {
		
		if (tecnologias.size() < 1){
			throw new TecnologiaInsuficienteException();
		}
		
		for (Tecnologia tecs : tecnologias) {
			if(tecs.getId() == null){
				throw new TecnologiaInvalidaException();
			}
		}
		
		for (Aluno aluno : alunos) {
			if(aluno.getId() == null){
				throw new AlunoInexistenteException();
			}
		}
		
		if(professor.getId() == null){
			throw new ProfessorInexistenteException();
		}
		
		if(professor.isInProjeto()){
			throw new ProfessorInProjetoException();
		}
		
		professor.setInProjeto(true);
		
		return new Projeto (titulo, descricaoProjeto, alunos, tecnologias, professor, dataInicio, dataConclusao, areaRelacionada);
	}

}
