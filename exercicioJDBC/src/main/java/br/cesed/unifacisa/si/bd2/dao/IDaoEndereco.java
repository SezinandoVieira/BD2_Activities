package br.cesed.unifacisa.si.bd2.dao;

import java.util.List;

import br.cesed.unifacisa.si.bd2.entities.Endereco;

public interface IDaoEndereco {

	void addEndereco(Endereco endereco) throws ClassNotFoundException;

	void deleteAutor(Endereco endereco) throws ClassNotFoundException;

	List<Endereco> getList() throws ClassNotFoundException;

	void update(Endereco endereco) throws ClassNotFoundException;
}
