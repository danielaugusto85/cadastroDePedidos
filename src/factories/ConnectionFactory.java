package factories;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

	/*
	 * Método para retornar uma conexão com o banco de dados do PostgreSQL
	 */
	public Connection getConnection() {

		// Variáveis
		var host = "jdbc.postgresql://localhost:5432/bdpedidos";
		var user = "postgres";
		var pass = "coti";

		// Abrir e retornar a conexão com o banco de dados
		try {
			return DriverManager.getConnection(host, user, pass);
		} catch (Exception e) {
			System.out.println("\nFalha ao conectar com o PostgreSQL: " + e.getMessage());
			return null;

		}

	}

}
