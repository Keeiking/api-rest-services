package com.company.outsources;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SqlConection {
	
	static Connection con = null;
	static Statement sql = null;
	static ResultSet res = null;

	public SqlConection() {
	}

	public static Connection connection() {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			System.out.println("El controlador de la base de datos se cargó correctamente");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		String url = "jdbc:sqlserver://pruebaudemdb.database.windows.net:1433;database=pruebaudemdbb;user=dbomanager@pruebaudemdb;password=Hola123*;encrypt=true;trustServerCertificate=false;hostNameInCertificate=.database.windows.net;loginTimeout=30;";
		String username = "dbomanager";
		String passward = "Hola123**";
		try {
			con = DriverManager.getConnection(url, username, passward);
			System.out.println("La conexión a la base de datos es exitosa");
		} catch (SQLException e) {
			// TODO bloque de captura generado automáticamente
			e.printStackTrace();
		}
		return con;
	}

	// Conexión de prueba
	public static void main(String[] args) {
		SqlConection a = new SqlConection();
		a.connection();
	}
}