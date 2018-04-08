package br.cesed.unifacisa.si.bd2.ltiproject.daos;

import java.util.ArrayList;
import java.util.List;

import br.cesed.unifacisa.si.bd2.ltiproject.entities.Projeto;
import br.cesed.unifacisa.si.bd2.ltiproject.interfaces.IDao;

public class ProjetoDAO implements IDao<Projeto, Long> {

	private Long idProjeto = 0L;
	private ArrayList<Projeto> projetos = new ArrayList<Projeto>();
	
	public Projeto add(Projeto objetoASerCriado) {
		objetoASerCriado.setId(idProjeto++);
		projetos.add(objetoASerCriado);
		return objetoASerCriado;
	}

	public void delete(Projeto objetoASerDeletado) {
		projetos.remove(objetoASerDeletado);
		idProjeto--;
	}

	public Projeto update(Projeto objetoUpadate) {
		int i = 0;
		for (; i < projetos.size(); i++) {
			if(projetos.get(i).equals(objetoUpadate)){
				projetos.set(i, objetoUpadate);
				break;
			}
		}
		return projetos.get(i);
	}

	public List<Projeto> get() {
		return projetos;
	}

	public Projeto getPorID(Long objetoID) {
		for (Projeto projetos : projetos) {
			if(projetos.getId().equals(objetoID))
				return projetos;
		}
		return null;
	}

}
