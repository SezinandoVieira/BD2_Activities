package br.cesed.unifacisa.si.bd2.managers;

import java.sql.SQLException;
import java.util.List;

import br.cesed.unifacisa.si.bd2.dao.IDaoLivros;
import br.cesed.unifacisa.si.bd2.entities.Livro;
import br.cesed.unifacisa.si.bd2.jdbc.LivrosJDBC;

public class GerenteDeBiblioteca {

private IDaoLivros livrojdbc = new LivrosJDBC();
	
	public void cadastrar(Livro livro) throws ClassNotFoundException, SQLException {
		livrojdbc.addLivro(livro);
	}
	
	public void atualizar(Livro livro) throws ClassNotFoundException, SQLException {
		livrojdbc.update(livro);
	}
	
	public void deletar(Livro livro) throws ClassNotFoundException, SQLException {
		livrojdbc.deleteLivro(livro);
	}
	
	public List<Livro> ListAll() throws ClassNotFoundException, SQLException {
		return livrojdbc.getList();
	}
}
