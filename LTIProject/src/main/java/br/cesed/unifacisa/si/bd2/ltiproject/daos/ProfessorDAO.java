package br.cesed.unifacisa.si.bd2.ltiproject.daos;

import java.util.ArrayList;
import java.util.List;

import br.cesed.unifacisa.si.bd2.ltiproject.entities.Professor;
import br.cesed.unifacisa.si.bd2.ltiproject.interfaces.IDao;

public class ProfessorDAO implements IDao<Professor, Long>{

	private ArrayList<Professor> professores = new ArrayList<Professor>();
	private Long idAtualp = 0L;
	
	public Professor add(Professor objetoASerCriado) {
		objetoASerCriado.setId(idAtualp++); 
		professores.add(objetoASerCriado);
		return objetoASerCriado;
	}

	public Professor delete(Professor objetoASerDeletado) {
		// TODO Auto-generated method stub
		return null;
	}

	public Professor update(Professor objetoUpadate) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Professor> get() {
		// TODO Auto-generated method stub
		return null;
	}

	public Professor getPorID(Long objetoID) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
