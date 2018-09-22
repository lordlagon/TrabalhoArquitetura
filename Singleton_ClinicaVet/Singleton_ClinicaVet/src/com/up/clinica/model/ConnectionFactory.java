package com.up.clinica.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory{

	 public static Connection conexao = null;
	   
	    private ConnectionFactory()
	    {
	       
	    }
	   
	    public static Connection getInstance()
	    {
	        try {
	            if(conexao == null)
	            {
	                Class.forName("org.hsqldb.jdbc.JDBCDriver");
	                conexao = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/clinicaveterinariadb", "SA", "");
	            }  
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return conexao;
	    }

}