package Entorno;

import com.sun.jdi.connect.spi.Connection;
import java.beans.Statement;

import java.sql.ResultSet;


public class Conexion {
 
    
    String name = "root";
    String pass = "";
    String url = "";
    Connection cn ;
    Statement st;
    ResultSet rs;
    
    public Connection conectar(){
        try {
    Class.forName("com.mysql.cj.jdbc.Driver");
         cn = Drivermanager.getConnection(url,name,pass);   
         System.out.print("conexion realizada");
        } catch (Exception e) {
            System.out.print("Error"+ e.getMessage());
        }
        return cn;
    }
    
}

