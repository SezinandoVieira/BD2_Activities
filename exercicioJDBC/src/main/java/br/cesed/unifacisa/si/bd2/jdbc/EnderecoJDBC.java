package br.cesed.unifacisa.si.bd2.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.cesed.unifacisa.si.bd2.dao.IDaoEndereco;
import br.cesed.unifacisa.si.bd2.entities.Endereco;
import br.cesed.unifacisa.si.bd2.factories.JDBCFactory;

public class EnderecoJDBC implements IDaoEndereco{

	public void addEndereco(Endereco endereco) throws ClassNotFoundException {
		try {
			Connection conn = JDBCFactory.criaInstancia();
			Statement insert = conn.createStatement();
			insert.executeUpdate("insert into enderecos (cep, numero, rua, bairro, cidade, estado) "
					+ "values (" + endereco.getCep() + ", "
					+ endereco.getNumero() + "," + endereco.getRua() + "," + endereco.getBairro() + "," + 
					endereco.getCidade() + "," + endereco.getEstado() + ")");
			insert.close();

		} catch (SQLException e) {
			System.out.println(e.getMessage());

		}
		
	}

	public void deleteAutor(Endereco endereco) throws ClassNotFoundException {
		try {
			Connection conn = JDBCFactory.criaInstancia();
			Statement stmt = conn.createStatement();
			stmt.executeUpdate("delete from enderecos where id_enderecor =" + endereco.getEnderecoId());
			stmt.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
	}

	public List<Endereco> getList() throws ClassNotFoundException {
		ArrayList<Endereco> enderecos = new ArrayList<Endereco>();
		try {
			Connection conn = JDBCFactory.criaInstancia();
			Statement state = conn.createStatement();
			ResultSet rs = state.executeQuery("select * from pessoas");

			while (rs.next()) {
				int enderecoID = rs.getInt("id_endereco");
				String cep = rs.getString("cep");
				int numero = rs.getInt("numero");
				String rua = rs.getString("rua");
				String bairro = rs.getString("bairro");
				String cidade = rs.getString("cidade");
				String estado = rs.getString("estado");
				Endereco end = new Endereco(enderecoID, cep, rua, bairro, cidade, estado, numero);
				enderecos.add(end);
				
				state.close();
				rs.close();
			}
		} catch (SQLException e) {
			System.out.println();
		}

		return enderecos;
	}


	public void update(Endereco endereco) throws ClassNotFoundException {
		try{
			Connection con = JDBCFactory.criaInstancia();
			
			String query = "update enderecos set cep = ?, numero = ?, rua = ?, bairro = ?, cidade = ?, estado = ? where id_endereco = ?";
			PreparedStatement prepared = con.prepareStatement(query);
			
			prepared.setString(1, endereco.getCep());
			prepared.setInt(2, endereco.getNumero());
			prepared.setString(3, endereco.getRua());
			prepared.setString(4, endereco.getBairro());
			prepared.setString(5, endereco.getCidade());
			prepared.setString(6, endereco.getEstado());
			prepared.setInt(7, (int) endereco.getEnderecoId());
			prepared.executeUpdate();
			prepared.close();
			
		} catch (SQLException s){
			System.out.println(s.getMessage());
		}
		
	}

}
