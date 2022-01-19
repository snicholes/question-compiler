package dev.nicholes.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
	private static ConnectionUtil connUtil;
	
	private ConnectionUtil() {

	}
	
	public static synchronized ConnectionUtil getConnectionUtil() {
		if (connUtil == null)
			connUtil = new ConnectionUtil();
		return connUtil;
	}
	
	public Connection getConnection() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(
					System.getenv("DB_URL"),
					System.getenv("DB_USER"),
					System.getenv("DB_PASS"));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return conn;
	}
}
