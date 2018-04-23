package br.cesed.unifacisa.si.bd2.jdbc;

import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.cesed.unifacisa.si.bd2.dao.IDao;
import br.cesed.unifacisa.si.bd2.entities.Livro;
import br.cesed.unifacisa.si.bd2.factories.JDBCFactory;

public class LivrosJDBC implements IDao {

	public void addLivro(Livro livro) throws ClassNotFoundException {
		try {
			Connection conn = JDBCFactory.criaInstancia();
			Statement insert = conn.createStatement();
			insert.executeUpdate("insert into livros (titulo, descricao) values (" + livro.getTitulo() + ", "
					+ livro.getDescricao() + ")");

		} catch (SQLException e) {
			System.out.println(e.getMessage());

		}

	}

	public void deleteLivro(Livro livro) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		try{
			Connection conn = JDBCFactory.criaInstancia();
			Statement stmt = conn.createStatement();
			stmt.executeUpdate("delete from livros where livro_id =" + livro.getLivroId());
		} catch (SQLException e){
			System.out.println(e.getMessage());
		}
	}

	public List<Livro>getList() throws ClassNotFoundException {
		ArrayList<Livro> livros = new ArrayList<Livro>();
		try{
			Connection conn = JDBCFactory.criaInstancia();
			Statement state = conn.createStatement();
			ResultSet rs = state.executeQuery("select * from pessoas");
			
			while(rs.next()){
				Livro book = new Livro();
				book.setTitulo(rs.getString("titulo"));
				book.setDescricao(rs.getString("descricao"));
				livros.add(book);
			}
		} catch (SQLException e){
			System.out.println();
		}
		
		
		return livros;
	}

	public void update(Livro livro) {
		// TODO Auto-generated method stub

	}
}
