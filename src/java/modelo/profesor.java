/*
        modelo
 */
package modelo;

/**
 *
 * @author Carlos Torres  ct059489@gmail.com
 */
public class profesor {
    
    private int id_teacher;
    private String name;
    private String avatar;
    

    public profesor() {
    }

    public profesor(int id_teacher, String name, String avatar) {
        this.id_teacher = id_teacher;
        this.name = name;
        this.avatar = avatar;
    }

    public int getId_teacher() {
        return id_teacher;
    }

    public void setId_teacher(int id_teacher) {
        this.id_teacher = id_teacher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

       
    
}
