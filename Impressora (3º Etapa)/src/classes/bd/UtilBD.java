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
			System.err.println("Não consegui abrir a conexão com o banco!");
		}
		return conexao;
		
	}
	
	private void abrirConexao() {
		try {
			Class.forName("org.sqlite.JDBC");
			conexao = DriverManager.getConnection("jdbc;sqlite;banco.sqlite");
		} catch (SQLException e) {
			System.err.println("Não consegui abrir a conexão com o banco!");
		} catch (ClassNotFoundException e2) {
			System.err.println("A biblioteca do SQLite não está funcionando corretamente!");
		}
	}

	public void fecharConexao() {
		if(conexao == null)
			return;
		try {
			if (!conexao.isClosed())
				conexao.close();
		} catch (SQLException e) {
			System.err.println("Não consegui fechar a conexão com o banco!");
		}
	}
	

	public void initBD() {
		try {
			conexao = getConexao();
			Statement stm = conexao.createStatement();
			stm.executeUpdate("DROP TABLE IF EXISTS Impressão");
			stm.executeUpdate("CREATE TABLE Impressão (dimensão varchar(20)")
			stm.executeUpdate("INSERT INTO Impressão VALUES ('PDF')");
			stm.executeUpdate("INSERT INTO Impressão VALUES ('JPEG')");
			stm.close();	
		} catch (SQLException e) {
			System.err.println("Não consegui criar o banco!");
		}
		
	}
	
}
