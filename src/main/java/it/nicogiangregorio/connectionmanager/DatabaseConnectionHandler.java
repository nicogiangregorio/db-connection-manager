package it.nicogiangregorio.connectionmanager;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class DatabaseConnectionHandler {

	private static DataSource dataSource;

	static {
		try {
			dataSource = (DataSource) new InitialContext().lookup("jndifordbconc");
		} catch (NamingException e) {
			throw new ExceptionInInitializerError("'jndifordbconc' not found in JNDI");
		}
	}

	public static Connection getConnection() throws SQLException {
		return dataSource.getConnection();
	}
}
