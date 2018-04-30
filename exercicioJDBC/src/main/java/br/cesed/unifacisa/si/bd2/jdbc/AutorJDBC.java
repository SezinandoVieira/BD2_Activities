package br.cesed.unifacisa.si.bd2.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.cesed.unifacisa.si.bd2.dao.IDaoAutor;
import br.cesed.unifacisa.si.bd2.entities.Autor;
import br.cesed.unifacisa.si.bd2.factories.JDBCFactory;

public class AutorJDBC implements IDaoAutor{

	public void addAutor(Autor autor) throws ClassNotFoundException {
		try {
			Connection conn = JDBCFactory.criaInstancia();
			Statement insert = conn.createStatement();
			insert.executeUpdate("insert into livros (nome, email) values (" + autor.getNome() + ", "
					+ autor.getEmail() + ")");

		} catch (SQLException e) {
			System.out.println(e.getMessage());

		}
		
	}

	public void deleteAutor(Autor autor) throws ClassNotFoundException {
		try {
			Connection conn = JDBCFactory.criaInstancia();
			Statement stmt = conn.createStatement();
			stmt.executeUpdate("delete from autores where id_autor =" + autor.getIdAutor());
			stmt.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
	}

	public List<Autor> getList() throws ClassNotFoundException {
		ArrayList<Autor> autores = new ArrayList<Autor>();
		try {
			Connection conn = JDBCFactory.criaInstancia();
			Statement state = conn.createStatement();
			ResultSet rs = state.executeQuery("select * from pessoas");

			while (rs.next()) {
				int autorID = rs.getInt("id_autor");
				String nomeAutor = rs.getString("nome");
				String email = rs.getString("email");
				Autor autor = new Autor(nomeAutor, email, autorID);
				autores.add(autor);
				
				state.close();
				rs.close();
			}
		} catch (SQLException e) {
			System.out.println();
		}

		return autores;
	}

	public void update(Autor autor) throws ClassNotFoundException {
		try{
			Connection con = JDBCFactory.criaInstancia();
			
			String query = "update autores set nome = ?, email = ? where id_autor = ?";
			PreparedStatement prepared = con.prepareStatement(query);
			
			prepared.setString(1, autor.getNome());
			prepared.setString(2, autor.getEmail());
			prepared.executeUpdate();
			prepared.close();
			
		} catch (SQLException s){
			System.out.println(s.getMessage());
		}
		
	}
	
public List<Autor> getByName(String nome) throws ClassNotFoundException, SQLException {
		
		List<Autor> autores = getList();
		List<Autor> found = new ArrayList<Autor>();
		
		for (Autor a : autores) {
			if(a.getNome().equals(nome)) {
				found.add(a);
			}
		}
		
		return found;
	}
	

}
