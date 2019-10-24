/*
 * mi dao
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.curso;

/**
 *
 * @author Carlos Torres ct059489@gmail.com
 */
public class cursoDao {
      // Metodos para las operaciones CRUD
    // Metodo para insertar
    public static boolean insertarcr(curso pr){
    
        try{
                Connection cone = LibConeccion.conectarnosDB();
                String SQLQueryInsertcr = "INSERT INTO course(id_course,id_teacher,name,themes,proyect) VALUES(?,?)";
             
                PreparedStatement ps = cone.prepareStatement(SQLQueryInsertcr);
                ps.setInt(1, pr.getId_profesor());
                ps.setInt(2, pr.getId_course());
                ps.setString(3, pr.getName());
                ps.setString(4, pr.getThemes());
                ps.setString(5, pr.getProyect());
                return ps.executeUpdate() > 0;
        } catch(SQLException ex){
        
            return false;
        }
            
    }
    
    // Metodo para Listar Vehiculos
    
    public static ArrayList<curso> listarcr(){
    
        try{
                String SQLQueryListarcr = "SELECT * FROM course";
                Connection conex = LibConeccion.conectarnosDB();
                PreparedStatement st = conex.prepareStatement(SQLQueryListarcr);
                
                ResultSet resultadoListarcr = st.executeQuery();
                ArrayList<curso> listacr = new ArrayList<>();
                curso listcurso;
                
                while(resultadoListarcr.next()){
                    listcurso = new curso();
                     listcurso.setId_course(resultadoListarcr.getInt("id_course"));
                    listcurso.setId_profesor(resultadoListarcr.getInt("id_profesor"));
                     listcurso.setName(resultadoListarcr.getString("name"));
                    listcurso.setThemes(resultadoListarcr.getString("themes"));
                    listcurso.setProyect(resultadoListarcr.getString("proyect"));
                    listacr.add(listcurso);
                }
                return listacr;
                
        }catch(SQLException ex){
        return null;
        }
        
        
    }
    
    public static String getCurso(int id_course){
    
        try{
            String sqlCursoFor = "select name from course where id_course=?";
            Connection conex = LibConeccion.conectarnosDB();
            PreparedStatement st = conex.prepareStatement(sqlCursoFor);
            
            // ENviar parametro del id
            st.setInt(1, id_course);
            ResultSet resultado = st.executeQuery();
            
            // Verificar si existen los TV y traer su nombre
            if(resultado.next()){
                return resultado.getString("name");
            }
            return "--";
            
        } catch (SQLException ex){
            return "--";
        }
    }
    
}


