package exercicioJDBC;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

import br.cesed.unifacisa.si.bd2.entities.Editora;
import br.cesed.unifacisa.si.bd2.entities.Endereco;
import br.cesed.unifacisa.si.bd2.entities.Livro;
import br.cesed.unifacisa.si.bd2.factories.JDBCFactory;
import br.cesed.unifacisa.si.bd2.jdbc.EditoraJDBC;
import br.cesed.unifacisa.si.bd2.jdbc.EnderecoJDBC;
import br.cesed.unifacisa.si.bd2.jdbc.LivrosJDBC;

public class JDBCLivroTest {

	@Test
	public void testCadastrar() throws ClassNotFoundException, SQLException {
		
			Endereco endereco = new Endereco(1, "58415570", "Paraiba", "Campina Grande", "Cruzeiro", "Figueiredo Agra", 258);
			EnderecoJDBC enderecojdbc = new EnderecoJDBC();
			enderecojdbc.addEndereco(endereco);
			
			Editora publisher = new Editora(1, "editora paulus", "2745278587", endereco);
			Editora publisher1 = new Editora(2, "editora brazil", "123123", endereco);
			EditoraJDBC editorajdbc = new EditoraJDBC();
			editorajdbc.addEditora(publisher);
			editorajdbc.addEditora(publisher1);
		
			Livro book = new Livro(1, "Cisco CCNA", "livro asjdasjd", "366454", publisher);
			Livro book1 = new Livro(2, "Marisvaldo Life", "eadsafe fdf asd", "941919", publisher1);
			
			LivrosJDBC bookJDBC = new LivrosJDBC();
			
			bookJDBC.addLivro(book);
			bookJDBC.addLivro(book1);
			
			Connection conn = JDBCFactory.criaInstancia();
			Statement state = conn.createStatement();
			state.executeUpdate("delete from livros where livro_id >= 1");
			state.executeUpdate("delete from editoras where id_editora >= 1");
			state.executeUpdate("delete from enderecos where id_endereco >= 1");
	}
	
	@Test
	public void deleteTest() throws ClassNotFoundException, SQLException{
	
		Endereco endereco = new Endereco(1, "58415570", "Paraiba", "Campina Grande", "Cruzeiro", "Figueiredo Agra", 258);
		EnderecoJDBC enderecojdbc = new EnderecoJDBC();
		enderecojdbc.addEndereco(endereco);
		
		Editora publisher = new Editora(1, "editora paulus", "2745278587", endereco);
		Editora publisher1 = new Editora(2, "editora brazil", "123123", endereco);
		EditoraJDBC editorajdbc = new EditoraJDBC();
		editorajdbc.addEditora(publisher);
		editorajdbc.addEditora(publisher1);
	
		Livro book = new Livro(1, "Cisco CCNA", "livro asjdasjd", "366454", publisher);
		Livro book1 = new Livro(2, "Marisvaldo Life", "eadsafe fdf asd", "941919", publisher1);
		
		LivrosJDBC bookJDBC = new LivrosJDBC();
		
		bookJDBC.addLivro(book);
		bookJDBC.addLivro(book1);
		
		bookJDBC.deleteLivro(book);
		bookJDBC.deleteLivro(book1);
		
		Connection conn = JDBCFactory.criaInstancia();
		Statement state = conn.createStatement();
		state.executeUpdate("delete from livros where livro_id >= 1");
		state.executeUpdate("delete from editoras where id_editora >= 1");
		state.executeUpdate("delete from enderecos where id_endereco >= 1");
		
	}
	
	@Test
	public void updateTest() throws ClassNotFoundException, SQLException {
		
		Endereco endereco = new Endereco(1, "58415570", "Paraiba", "Campina Grande", "Cruzeiro", "Figueiredo Agra", 258);
		EnderecoJDBC enderecojdbc = new EnderecoJDBC();
		enderecojdbc.addEndereco(endereco);
		
		Editora publisher = new Editora(1, "editora paulus", "2745278587", endereco);
		Editora publisher1 = new Editora(2, "editora brazil", "123123", endereco);
		EditoraJDBC editorajdbc = new EditoraJDBC();
		editorajdbc.addEditora(publisher);
		editorajdbc.addEditora(publisher1);
	
		Livro book = new Livro(1, "Cisco CCNA", "livro asjdasjd", "366454", publisher);
		Livro book1 = new Livro(2, "Marisvaldo Life", "eadsafe fdf asd", "941919", publisher1);
		
		LivrosJDBC bookJDBC = new LivrosJDBC();
		
		bookJDBC.addLivro(book);
		bookJDBC.addLivro(book1);
		
		book.setTitulo("REDES 100%");
		
		bookJDBC.update(book);
		
		Connection conn = JDBCFactory.criaInstancia();
		Statement state = conn.createStatement();
		state.executeUpdate("delete from livros where livro_id >= 1");
		state.executeUpdate("delete from editoras where id_editora >= 1");
		state.executeUpdate("delete from enderecos where id_endereco >= 1");
	}
	
	@Test
	public void listTest() throws ClassNotFoundException, SQLException {
		
		Endereco endereco = new Endereco(1, "58415570", "Paraiba", "Campina Grande", "Cruzeiro", "Figueiredo Agra", 258);
		EnderecoJDBC enderecojdbc = new EnderecoJDBC();
		enderecojdbc.addEndereco(endereco);
		
		Editora publisher = new Editora(1, "editora paulus", "2745278587", endereco);
		Editora publisher1 = new Editora(2, "editora brazil", "123123", endereco);
		EditoraJDBC editorajdbc = new EditoraJDBC();
		editorajdbc.addEditora(publisher);
		editorajdbc.addEditora(publisher1);
	
		Livro book = new Livro(1, "Cisco CCNA", "livro asjdasjd", "366454", publisher);
		Livro book1 = new Livro(2, "Marisvaldo Life", "eadsafe fdf asd", "941919", publisher1);
		
		LivrosJDBC bookJDBC = new LivrosJDBC();
		
		bookJDBC.addLivro(book);
		bookJDBC.addLivro(book1);
		
		bookJDBC.getList();
		
		Connection conn = JDBCFactory.criaInstancia();
		Statement state = conn.createStatement();
		state.executeUpdate("delete from livros where livro_id >= 1");
		state.executeUpdate("delete from editoras where id_editora >= 1");
		state.executeUpdate("delete from enderecos where id_endereco >= 1");
	}
	
	@Test
	public void listaPorNomeTest() throws ClassNotFoundException, SQLException {
		
		Endereco endereco = new Endereco(1, "58415570", "Paraiba", "Campina Grande", "Cruzeiro", "Figueiredo Agra", 258);
		EnderecoJDBC enderecojdbc = new EnderecoJDBC();
		enderecojdbc.addEndereco(endereco);
		
		Editora publisher = new Editora(1, "editora paulus", "2745278587", endereco);
		Editora publisher1 = new Editora(2, "editora brazil", "123123", endereco);
		EditoraJDBC editorajdbc = new EditoraJDBC();
		editorajdbc.addEditora(publisher);
		editorajdbc.addEditora(publisher1);
	
		Livro book = new Livro(1, "Cisco CCNA", "livro asjdasjd", "366454", publisher);
		Livro book1 = new Livro(2, "Marisvaldo Life", "eadsafe fdf asd", "941919", publisher1);
		
		LivrosJDBC bookJDBC = new LivrosJDBC();
		
		bookJDBC.addLivro(book);
		bookJDBC.addLivro(book1);
		
		bookJDBC.listByTittle("Cisco CCNA");
		
		Connection conn = JDBCFactory.criaInstancia();
		Statement state = conn.createStatement();
		state.executeUpdate("delete from livros where livro_id >= 1");
		state.executeUpdate("delete from editoras where id_editora >= 1");
		state.executeUpdate("delete from enderecos where id_endereco >= 1");
	}

}
