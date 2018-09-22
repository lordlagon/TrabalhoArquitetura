package com.up.clinica.model;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConnectionSingleton {

	public static Connection conexaoXZ = null;

	private ConnectionSingleton() {
	}

	public static Connection getInstance() {
		try {
			if (conexaoXZ == null) {
				Class.forName("org.hsqldb.jdbc.JDBCDriver");
				conexaoXZ = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/clinicaveterinariadb", "SA", "");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conexaoXZ;
	}

}