package br.cesed.unifacisa.si.bd2.jdbc;

import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.cesed.unifacisa.si.bd2.dao.IDaoLivros;
import br.cesed.unifacisa.si.bd2.entities.Editora;
import br.cesed.unifacisa.si.bd2.entities.Endereco;
import br.cesed.unifacisa.si.bd2.entities.Livro;
import br.cesed.unifacisa.si.bd2.factories.JDBCFactory;

public class LivrosJDBC implements IDaoLivros {

	public void addLivro(Livro livro) throws ClassNotFoundException {
		try {
			Connection conn = JDBCFactory.criaInstancia();
			PreparedStatement insert = conn.prepareStatement("insert into livros values (?, ?, ?)");
			insert.setString(1, livro.getTitulo());
			insert.setString(2, livro.getDescricao());
			insert.setString(3, livro.getIsbn());

			insert.executeUpdate();
			insert.close();

		} catch (SQLException e) {
			System.out.println(e.getMessage());

		}

	}

	public void deleteLivro(Livro livro) throws ClassNotFoundException {
		try {
			Connection conn = JDBCFactory.criaInstancia();
			Statement stmt = conn.createStatement();
			stmt.executeUpdate("delete from livros where livro_id =" + livro.getLivroId());
			stmt.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public List<Livro> getList() throws ClassNotFoundException {
		ArrayList<Livro> livros = new ArrayList<Livro>();
		try {
			Connection conn = JDBCFactory.criaInstancia();
			Statement state = conn.createStatement();
			ResultSet rs = state.executeQuery("select * from pessoas");

			while (rs.next()) {
				int livroID = rs.getInt("livro_id");
				String tittle = rs.getString("titulo");
				String desc = rs.getString("descricao");
				String isbn = rs.getString("isbn");
				int editoraID = rs.getInt("editora_id");
				List<Editora> publishers = getEditorasOnLivros();
				Editora editora = null;
				for (Editora e : publishers) {
					if (e.getIdEditora() == editoraID) {
						editora = e;
					}
				}
				Livro book = new Livro(livroID, tittle, desc, isbn, editora);
				livros.add(book);
			}

		} catch (SQLException e) {
			System.out.println();
		}

		return livros;
	}

	public void update(Livro livro) throws ClassNotFoundException {
		try {
			Connection con = JDBCFactory.criaInstancia();

			String sql = "update livros set titulo = ?, descricao = ?, id_editora = ? where id_livro = ?";
			PreparedStatement prepared = con.prepareStatement(sql);

			prepared.setString(1, livro.getTitulo());
			prepared.setString(2, livro.getDescricao());
			prepared.setObject(3, livro.getEditora().getIdEditora());
			prepared.setInt(4, (int) livro.getLivroId());
			prepared.executeUpdate();
			prepared.close();

		} catch (SQLException s) {
			System.out.println(s.getMessage());
		}

	}

	public List<Editora> getEditorasOnLivros() throws SQLException, ClassNotFoundException {
		Connection con = JDBCFactory.criaInstancia();

		ArrayList<Editora> editoras = new ArrayList<Editora>();

		String sql1 = "select * from editoras";
		PreparedStatement pst1 = con.prepareStatement(sql1);

		ResultSet rs1 = pst1.executeQuery();
		while (rs1.next()) {
			int id_editora = rs1.getInt("id_editora");
			int id_endereco = rs1.getInt("id_endereco");
			List<Endereco> enderecos = getEnderecosOnLivros();
			Endereco endereco = null;
			for (Endereco end : enderecos) {
				if (end.getEnderecoId() == id_endereco) {
					endereco = end;
					break;
				}
			}
			String nome = rs1.getString("nome");
			String cnpj = rs1.getString("cnpj");
			Editora editora = new Editora(id_editora, cnpj, nome, endereco);
			editoras.add(editora);
		}
		pst1.close();
		rs1.close();
		return editoras;
	}

	public List<Endereco> getEnderecosOnLivros() throws ClassNotFoundException, SQLException {
		Connection con = JDBCFactory.criaInstancia();

		ArrayList<Endereco> enderecos = new ArrayList<Endereco>();

		String sql = "select * from enderecos";
		PreparedStatement prepared1 = con.prepareStatement(sql);

		ResultSet result1 = prepared1.executeQuery();
		while (result1.next()) {
			int id_endereco = result1.getInt("id_endereco");
			String cep = result1.getString("cep");
			String estado = result1.getString("estado");
			String cidade = result1.getString("cidade");
			String bairro = result1.getString("bairro");
			String rua = result1.getString("rua");
			int numero = result1.getInt("numero");
			Endereco endereco = new Endereco(id_endereco, cep, estado, cidade, bairro, rua, numero);
			enderecos.add(endereco);
		}
		prepared1.close();
		result1.close();
		return enderecos;
	}

	public List<Livro> listByTittle(String titulo) throws ClassNotFoundException, SQLException {
		List<Livro> livros = getList();
		List<Livro> found = new ArrayList<Livro>();

		for (Livro l : livros) {
			if (l.getTitulo().equals(titulo)) {
				found.add(l);
			}
		}

		return found;
	}

}
