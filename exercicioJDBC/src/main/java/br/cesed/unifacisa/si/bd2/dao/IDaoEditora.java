package br.cesed.unifacisa.si.bd2.dao;

import java.sql.SQLException;
import java.util.List;

import br.cesed.unifacisa.si.bd2.entities.Editora;

public interface IDaoEditora {

	void addEditora(Editora editora) throws ClassNotFoundException;

	void deleteEditora(Editora editora) throws ClassNotFoundException;

	List<Editora> getList() throws ClassNotFoundException, SQLException;

	void update(Editora editora) throws ClassNotFoundException;
}
