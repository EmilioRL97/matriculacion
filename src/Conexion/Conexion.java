/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Emilio
 */
public class Conexion {
        public static Connection open() throws SQLException{
        String url="jdbc:postgresql://localhost:5432/Proyecto";
	String user="postgres";
	String password="1997";
		
        Connection conn = DriverManager.getConnection(url, user, password);
        return conn;
    }
}
