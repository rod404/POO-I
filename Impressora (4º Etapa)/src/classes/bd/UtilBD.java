package classes.bd;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UtilBD {
	private Connection conexao;
	
	public Connection getConexao() {
		try {
			if (conexao == null)
				abrirConexao();	
			
			if (conexao.isClosed())
				abrirConexao();	
			
		} catch (SQLException e) {
			System.err.println("N�o consegui abrir a conex�o com o banco!");
		}
		return conexao;
		
	}
	
	private void abrirConexao() {
		try {
			Class.forName("org.sqlite.JDBC");
			conexao = DriverManager.getConnection("jdbc;sqlite;banco.sqlite");
		} catch (SQLException e) {
			System.err.println("N�o consegui abrir a conex�o com o banco!");
		} catch (ClassNotFoundException e2) {
			System.err.println("A biblioteca do SQLite n�o est� funcionando corretamente!");
		}
	}

	public void fecharConexao() {
		if(conexao == null)
			return;
		try {
			if (!conexao.isClosed())
				conexao.close();
		} catch (SQLException e) {
			System.err.println("N�o consegui fechar a conex�o com o banco!");
		}
	}
	

	public void initBD() {
		try {
			conexao = getConexao();
			Statement stm = conexao.createStatement();
			stm.executeUpdate("DROP TABLE IF EXISTS Impress�o");
			stm.executeUpdate("CREATE TABLE Impress�o (dimens�o varchar(20)")
			stm.executeUpdate("INSERT INTO Impress�o VALUES ('PDF')");
			stm.executeUpdate("INSERT INTO Impress�o VALUES ('JPEG')");
			stm.close();	
		} catch (SQLException e) {
			System.err.println("N�o consegui criar o banco!");
		}
		
	}
	
}
