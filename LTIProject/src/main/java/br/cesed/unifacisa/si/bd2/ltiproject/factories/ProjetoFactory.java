package br.cesed.unifacisa.si.bd2.ltiproject.factories;

import java.util.ArrayList;
import java.util.Date;

import br.cesed.unifacisa.si.bd2.ltiproject.entities.Aluno;
import br.cesed.unifacisa.si.bd2.ltiproject.entities.Professor;
import br.cesed.unifacisa.si.bd2.ltiproject.entities.Projeto;
import br.cesed.unifacisa.si.bd2.ltiproject.entities.Tecnologia;

public class ProjetoFactory {

	public static Projeto criaInstancia(String titulo, String descricaoProjeto, ArrayList<Aluno> alunos, 
			ArrayList<Tecnologia> tecnologias, Professor professor, Date dataInicio, Date dataConclusao) {
		
		if (tecnologias.size() < 1){
			
		}
		
		for (Tecnologia tecs : tecnologias) {
			if(tecs.getId() != null){
				
			}
		}
		
		for (Aluno aluno : alunos) {
			if(aluno.getId() != null){
				
			}
		}
		
		if(professor.getId() != null){
			
		}
		
		if(professor.isInProjeto()){
			
		}
		
		professor.setInProjeto(true);
		
		return new Projeto (titulo, descricaoProjeto, alunos, tecnologias, professor, dataInicio, dataConclusao);
	}

}
