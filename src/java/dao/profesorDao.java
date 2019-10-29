/*
 *  el dao 
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.profesor;

/**
 *
 * @author Carlos Torres ct059489@gmail.com     
 */
public class profesorDao {
    
   // Metodos para las operaciones CRUD
    // Metodo para insertar

       public static boolean insertapr(profesor p){
    
        try{
                Connection cone = LibConeccion.conectarnosDB();
                String SQLQueryInsertpr = "INSERT INTO teacher(id_teacher,name,avatar) VALUES(?,?)";
             
                PreparedStatement ps = cone.prepareStatement(SQLQueryInsertpr);
                ps.setString(1, p.getName());
                ps.setString(2, p.getAvatar());
                ps.setInt(3, p.getId_teacher());
                return ps.executeUpdate() > 0;
        } catch(SQLException ex){
        
            return false;
        }
            
    }
       
        public static ArrayList<profesor> listarp(){
    
        try{
                String SQLQueryListarp = "SELECT * FROM teacher";
                Connection conex = LibConeccion.conectarnosDB();
                PreparedStatement st = conex.prepareStatement(SQLQueryListarp);
                
                ResultSet resultadoListarp = st.executeQuery();
                ArrayList<profesor> listap = new ArrayList<>();
                profesor Profesor;
                
                while(resultadoListarp.next()){
                    Profesor = new profesor();
                    Profesor.setName(resultadoListarp.getString("name"));
                    Profesor.setAvatar(resultadoListarp.getString("avatar"));
                    Profesor.setId_teacher(resultadoListarp.getInt("id_profesor"));
                    listap.add(Profesor);
                }
                return listap;
                
        }catch(SQLException ex){
        return null;
        }
        
        
    }
}
