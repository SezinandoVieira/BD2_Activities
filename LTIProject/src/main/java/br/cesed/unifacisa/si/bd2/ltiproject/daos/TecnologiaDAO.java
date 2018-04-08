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

	public void delete(Tecnologia objetoASerDeletado) {
		tecnologias.remove(objetoASerDeletado);
		idTec--;
	}

	public Tecnologia update(Tecnologia objetoUpadate) {
		int i = 0;
		for (; i < tecnologias.size(); i++) {
			if(tecnologias.get(i).equals(objetoUpadate)){
				tecnologias.set(i, objetoUpadate);
				break;
			}
		}
		return tecnologias.get(i);
	}

	public List<Tecnologia> get() {
		// TODO Auto-generated method stub
		return tecnologias;
	}

	public Tecnologia getPorID(Long objetoID) {
		for (Tecnologia tecnologia : tecnologias) {
			if(tecnologia.getId().equals(objetoID))
				return tecnologia;
		}
		return null;
	}

}
