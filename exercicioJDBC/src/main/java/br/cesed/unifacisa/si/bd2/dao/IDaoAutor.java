package br.cesed.unifacisa.si.bd2.dao;

import java.util.List;

import br.cesed.unifacisa.si.bd2.entities.Autor;

public interface IDaoAutor {

	void addAutor(Autor autor) throws ClassNotFoundException;

	void deleteAutor(Autor autor) throws ClassNotFoundException;

	List<Autor> getList() throws ClassNotFoundException;

	void update(Autor autor) throws ClassNotFoundException;
}
