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

	public Projeto delete(Projeto objetoASerDeletado) {
		// TODO Auto-generated method stub
		return null;
	}

	public Projeto update(Projeto objetoUpadate) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Projeto> get() {
		// TODO Auto-generated method stub
		return null;
	}

	public Projeto getPorID(Long objetoID) {
		// TODO Auto-generated method stub
		return null;
	}

}
