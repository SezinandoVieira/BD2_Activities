package br.cesed.unifacisa.si.bd2.dao;

import java.util.List;

import br.cesed.unifacisa.si.bd2.entities.Livro;

public interface IDaoLivros {

	void addLivro(Livro livro) throws ClassNotFoundException;

	void deleteLivro(Livro livro) throws ClassNotFoundException;

	List<Livro> getList() throws ClassNotFoundException;

	void update(Livro livro) throws ClassNotFoundException;

}
