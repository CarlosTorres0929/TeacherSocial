/*
 paquete dao
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Carlos Torres
 */
public class LibConeccion {
    
    // Metodo para la aplicacion
    
    public static Connection conectarnosDB(){
        
        try{
            // Crear Datos connection
            String dbDriver = "com.mysql.jdbc.Driver";
            String dbURL = "jdbc:mysql://localhost:3306/";
            
            // Traer datos de la base de datos
            
            String dbName = "teacher_social";
            String dbUser = "root";
            String bdPassword = "";
            
            // Configurar la base de datos
            Class.forName(dbDriver);
            Connection conex = DriverManager.getConnection(dbURL + dbName, dbUser, bdPassword);
            return conex;
            
        }catch(ClassNotFoundException | SQLException ex){
            return null;
        }
         
        /*
        // metodo para probar la conexion
       Connection con = null;
       public LibConeccion(){
           
           try{
               Class.forName("com.mysql.jdbc.Driver");
               con = DriverManager.getConnection("jdbc:mysql://localhost:3306/consecionario_torres", "root", "");
               
               boolean ok = con.isValid(5000);
               System.out.println(ok ? "Conexion bien" : "Conexion fallo");
               
           } catch (SQLException ex){
               System.out.println("Mensaje: " + ex.getMessage());
           } catch (ClassNotFoundException e) {
               System.out.println("Mensaje: " + e.getMessage());
           }
       }
       
       public Connection getConnection(){
           return con;
       }
         */   
    }
}
    
    
    

