package br.cesed.unifacisa.si.bd2.ltiproject.interfaces;

import java.util.List;

public interface IDao <T, ID>{
	
	T add(T objetoASerCriado);
	T delete(T objetoASerDeletado);
	T update(T objetoUpadate);
	T getPorID (ID objetoID);
	
	public List<T> get();
}
