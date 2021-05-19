
package basededatospro;


import java.sql.Connection;
import java.sql.DriverManager;

public class BaseDeDatosPRo{
    Connection enlazar = null;

public Connection conectar(){
        
        try {
            
            enlazar =  DriverManager.getConnection("jdbc:mysql://localhost/bd_equipo","root","");
            
        } catch (Exception e) {
            
        }
    return enlazar;
    }
}
    

