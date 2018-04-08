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

	public Aluno delete(Aluno objetoASerDeletado) {
		// TODO Auto-generated method stub
		return null;
	}

	public Aluno update(Aluno objetoUpadate) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Aluno> get() {
		// TODO Auto-generated method stub
		return new ArrayList<Aluno>();
	}

	public Aluno getPorID(Long objetoID) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
