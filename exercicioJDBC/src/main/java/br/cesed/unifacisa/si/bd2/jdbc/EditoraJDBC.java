package br.cesed.unifacisa.si.bd2.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.cesed.unifacisa.si.bd2.dao.IDaoEditora;
import br.cesed.unifacisa.si.bd2.entities.Editora;
import br.cesed.unifacisa.si.bd2.entities.Endereco;
import br.cesed.unifacisa.si.bd2.factories.JDBCFactory;

public class EditoraJDBC implements IDaoEditora {

	public void addEditora(Editora editora) throws ClassNotFoundException {
		try {
			Connection conn = JDBCFactory.criaInstancia();
			Statement insert = conn.createStatement();
			insert.executeUpdate(
					"insert into livros (id_editora, id_endereco, nome, cnpj) values (" + editora.getIdEditora() + ", "
							+ editora.getEndereco().getEnderecoId() + "," + editora.getNome() + "," + editora.getCnpj() + ")");
			insert.close();

		} catch (SQLException e) {
			System.out.println(e.getMessage());

		}

	}

	public void deleteEditora(Editora editora) throws ClassNotFoundException {
		try {
			Connection conn = JDBCFactory.criaInstancia();
			Statement stmt = conn.createStatement();
			stmt.executeUpdate("delete from editoras where id_editora =" + editora.getIdEditora());
			stmt.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public List<Editora> getList() throws ClassNotFoundException, SQLException {
		Connection conn = JDBCFactory.criaInstancia();

		List<Endereco> enderecos = getEnderecosOnEditora();

		ArrayList<Editora> editoras = new ArrayList<Editora>();

		String query = "select * from editoras";
		PreparedStatement pstate = conn.prepareStatement(query);

		ResultSet rs = pstate.executeQuery();
		while (rs.next()) {
			int idEditora = rs.getInt("id_editora");
			int idEndereco = rs.getInt("id_endereco");
			Endereco endereco = null;
			for (Endereco e : enderecos) {
				if (e.getEnderecoId() == idEndereco) {
					endereco = e;
					break;
				}
			}
			String nome = rs.getString("nome");
			String cnpj = rs.getString("cnpj");
			Editora editora = new Editora(idEditora, cnpj, nome, endereco);
			editoras.add(editora);
		}
		pstate.close();
		rs.close();
		return editoras;
	}

	public List<Endereco> getEnderecosOnEditora() throws ClassNotFoundException, SQLException {
		Connection con = JDBCFactory.criaInstancia();

		ArrayList<Endereco> enderecos = new ArrayList<Endereco>();

		String sql = "select * from enderecos";
		PreparedStatement state = con.prepareStatement(sql);

		ResultSet rs = state.executeQuery();
		while (rs.next()) {
			int id_endereco = rs.getInt("id_endereco");
			String cep = rs.getString("cep");
			String estado = rs.getString("estado");
			String cidade = rs.getString("cidade");
			String bairro = rs.getString("bairro");
			String rua = rs.getString("rua");
			int numero = rs.getInt("numero");
			Endereco endereco = new Endereco(id_endereco, cep, estado, cidade, bairro, rua, numero);
			enderecos.add(endereco);
		}

		state.close();
		rs.close();
		return enderecos;
	}

	public List<Editora> nameList(String nome) throws ClassNotFoundException, SQLException {
		List<Editora> editoras = getList();
		List<Editora> achados = new ArrayList<Editora>();

		for (Editora e : editoras) {
			if (e.getNome().equals(nome)) {
				achados.add(e);
			}
		}
		return achados;
	}

	public Editora getByCNPJ(String cnpj) throws ClassNotFoundException, SQLException {
		List<Editora> editoras = getList();
		Editora editora = null;
		for (Editora e : editoras) {
			if (e.getCnpj().equals(cnpj)) {
				editora = e;
			}
		}
		return editora;
	}

	public void update(Editora editora) throws ClassNotFoundException {
		try{
			Connection con = JDBCFactory.criaInstancia();

			String sql = "update editoras set id_endereco = ?, nome = ?, cnpj = ? where id_editora = ?";
			PreparedStatement pstate = con.prepareStatement(sql);
			pstate.setInt(1, (int) editora.getEndereco().getEnderecoId());
			pstate.setString(2, editora.getNome());
			pstate.setString(3, editora.getCnpj());
			pstate.setInt(4, (int) editora.getIdEditora());

			pstate.executeUpdate();
			pstate.close();
			
		} catch(SQLException s){
			System.out.println(s.getMessage());
		}
		

	}

}
