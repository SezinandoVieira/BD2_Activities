package br.cesed.unifacisa.si.bd2.factories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCFactory {

	
	
	public static Connection criaInstancia() throws SQLException, ClassNotFoundException{
		
		Class.forName("org.postgresql.Driver");
		
		String url = "jdbc:postgresql://localhost:5432/Biblioteca";
		String user = "postgres";
		String password = "123456";
		
		
		Connection myCon = DriverManager.getConnection(url, user, password);
		return myCon;
		
	}
	
	
}
