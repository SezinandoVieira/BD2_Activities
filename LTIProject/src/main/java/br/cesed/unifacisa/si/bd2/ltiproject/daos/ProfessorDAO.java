package br.cesed.unifacisa.si.bd2.ltiproject.daos;

import java.util.ArrayList;
import java.util.List;

import br.cesed.unifacisa.si.bd2.ltiproject.entities.Professor;
import br.cesed.unifacisa.si.bd2.ltiproject.interfaces.IDao;

public class ProfessorDAO implements IDao<Professor, Long> {

	private ArrayList<Professor> professores = new ArrayList<Professor>();
	private Long idAtualp = 0L;

	public Professor add(Professor objetoASerCriado) {
		objetoASerCriado.setId(idAtualp++);
		professores.add(objetoASerCriado);
		return objetoASerCriado;
	}

	public void delete(Professor objetoASerDeletado) {
		professores.remove(objetoASerDeletado);
		idAtualp--;
	}

	public Professor update(Professor objetoUpadate) {
		int i = 0;
		for (; i < professores.size(); i++) {
			if (professores.get(i).equals(objetoUpadate)) {
				professores.set(i, objetoUpadate);
				break;
			}
		}
		return professores.get(i);
	}

	public List<Professor> get() {
		return professores;
	}

	public Professor getPorID(Long objetoID) {
		for (Professor professores : professores) {
			if (professores.getId().equals(objetoID))
				return professores;
		}

		return null;
	}

}
