package br.cesed.unifacisa.si.bd2.ltiproject.daos;

import java.util.ArrayList;
import java.util.List;

import br.cesed.unifacisa.si.bd2.ltiproject.entities.Aluno;
import br.cesed.unifacisa.si.bd2.ltiproject.interfaces.IDao;

public class AlunoDAO implements IDao<Aluno, Long>{

	private ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	private Long idAtual = 0L;
	
	public Aluno add(Aluno objetoASerCriado) {
		objetoASerCriado.setId(idAtual++);
		alunos.add(objetoASerCriado);
		return objetoASerCriado;
	}

	public void delete(Aluno objetoASerDeletado) {
		alunos.remove(objetoASerDeletado);
		idAtual--;
	}

	public Aluno update(Aluno objetoUpadate) {
		int i = 0;
		for (; i < alunos.size(); i++) {
			if(alunos.get(i).equals(objetoUpadate)){
				alunos.set(i, objetoUpadate);
				break;
			}
		}
		return alunos.get(i);
	}

	public List<Aluno> get() {
		return alunos;
	}

	public Aluno getPorID(Long objetoID) {
		for (Aluno aluno : alunos) {
			if(aluno.getId().equals(objetoID))
				return aluno;
		}
		return null;
	}
	
}
