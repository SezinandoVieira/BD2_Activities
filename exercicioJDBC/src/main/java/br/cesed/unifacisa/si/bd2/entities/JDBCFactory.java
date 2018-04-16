package br.cesed.unifacisa.si.bd2.entities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCFactory {

	private static Connection conn;
	
	private JDBCFactory() throws SQLException, ClassNotFoundException{
		
		Class.forName("org.postgresql.Driver");
		
		String url = "jdbc:postgresql://localhost:5432/Biblioteca";
		String user = "sezinando";
		String password = "123456";
		
		
		this.conn = DriverManager.getConnection(url, user, password);
		
	}
	
	public static Connection getConnection(){
		return conn;
	}
	
	
}
