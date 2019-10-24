/*
 *modelo
 */
package modelo;

/**
 *
 * @author Carlos Torres ct059489@gmail.com
 */
public class curso {
    
    private int id_course;
    private int id_profesor;
    private String name;
    private String themes;
    private String proyect;

    public curso() {
    }

    public curso(int id_course, int id_profesor, String name, String themes, String proyect) {
        this.id_course = id_course;
        this.id_profesor = id_profesor;
        this.name = name;
        this.themes = themes;
        this.proyect = proyect;
    }

    public int getId_course() {
        return id_course;
    }

    public void setId_course(int id_course) {
        this.id_course = id_course;
    }

    public int getId_profesor() {
        return id_profesor;
    }

    public void setId_profesor(int id_profesor) {
        this.id_profesor = id_profesor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getThemes() {
        return themes;
    }

    public void setThemes(String themes) {
        this.themes = themes;
    }

    public String getProyect() {
        return proyect;
    }

    public void setProyect(String proyect) {
        this.proyect = proyect;
    }
    
    
    
}
