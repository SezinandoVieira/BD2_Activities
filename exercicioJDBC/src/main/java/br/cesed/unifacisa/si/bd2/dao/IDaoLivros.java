package br.cesed.unifacisa.si.bd2.dao;


import br.cesed.unifacisa.si.bd2.entities.Livro;

public interface IDaoLivros {
	
	void addLivro (Livro livro);
	void deleteLivro(Livro livro);
	Livro getList();
	void update (Livro livro);
	
}
