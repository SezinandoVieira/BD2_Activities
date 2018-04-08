package br.cesed.unifacisa.si.bd2.ltiproject.daos;

import java.util.ArrayList;
import java.util.List;

import br.cesed.unifacisa.si.bd2.ltiproject.entities.Tecnologia;
import br.cesed.unifacisa.si.bd2.ltiproject.interfaces.IDao;

public class TecnologiaDAO implements IDao<Tecnologia, Long>{

	private Long idTec = 0L;
	private ArrayList<Tecnologia> tecnologias = new ArrayList<Tecnologia>();
	
	public Tecnologia add(Tecnologia objetoASerCriado) {
		objetoASerCriado.setId(idTec++);
		tecnologias.add(objetoASerCriado);
		return objetoASerCriado;
	}

	public Tecnologia delete(Tecnologia objetoASerDeletado) {
		// TODO Auto-generated method stub
		return null;
	}

	public Tecnologia update(Tecnologia objetoUpadate) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Tecnologia> get() {
		// TODO Auto-generated method stub
		return null;
	}

	public Tecnologia getPorID(Long objetoID) {
		// TODO Auto-generated method stub
		return null;
	}

}
