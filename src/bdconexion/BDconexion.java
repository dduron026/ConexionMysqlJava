package bdconexion;

import java.sql.Connection;
import java.sql.SQLException;

public class BDconexion {
    
     
    public static void main(String[] args) throws SQLException  {
        
         Connection con = null;   
        
        try {
            
            con = Conection.getConnection();
            
            System.out.println("Conexion con exito");
            
            
        } catch (SQLException e) {
            System.err.print(e);
        }
        
        finally{
            if(con != null){
                con.close();
            
            }
        }
        
         
    }
    
}
