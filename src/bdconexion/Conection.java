/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdconexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;




/**
 *
 * @author CECILIA
 */
public class Conection {
    
    private static final String USUARIO = "root";
    private static final String CONTRA = "";
    private static final String CADENA = "jdbc:mysql://localhost/botanasplebes";
    
        
    public static Connection getConnection() throws SQLException{
        
        return DriverManager.getConnection(USUARIO, CONTRA, CADENA);
    }
    
    
    
    
}
