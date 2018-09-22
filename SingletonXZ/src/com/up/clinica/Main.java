//Alunos: André Xavier e Alexandre de Faria
package com.up.clinica;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.up.clinica.model.ConnectionSingleton;

public class Main {
	public static void main(String[] args) {
		Connection conn = ConnectionSingleton.getInstance();
        try {
            Statement statement = conn.createStatement();
            ResultSet resultset = statement.executeQuery("select * from animal");
           
            while(resultset.next())
            {
                System.out.println(resultset.getString(1)+" "+resultset.getString(2));
            }
           
        } catch (Exception e) {
            System.out.println("Algo deu errado");
        }
    }

}