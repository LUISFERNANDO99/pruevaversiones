/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.ropa.herramientas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author luisf
 */
public class Conexion {
    
   private Connection cnn = null;
    private String user = "root";
    private String pwd = "admin";
        private String url = "jdbc:mysql://localhost:3306/proyecto?useSSL=false";
    private String mySqlDriver = "com.mysql.jdbc.Driver";
    
    public Conexion(){
        try{
         Class.forName(mySqlDriver);
         cnn = DriverManager.getConnection(url, user , pwd);
            if (cnn != null) {
                System.out.println("Conexion existosa " + cnn);
            }
        }catch(Exception e){
            System.out.println("NO se puedo conectar " + e.getMessage());
            e.printStackTrace();
        }
    }
    public Connection getCnn(){
        return cnn;
    }
    
    public void cerrarConexion() throws SQLException{
        cnn.close();
    }
}
