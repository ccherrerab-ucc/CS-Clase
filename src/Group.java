import java.util.List;

public class Group {
    private int id_group;
    private String nombre;
    private int creditos;
    private String correo;
    private String franja;
    private List<Student> students;


    public Group(int id_group, String nombre, int creditos, String correo, String franja, List<Student> students) {
        this.id_group = id_group;
        this.nombre = nombre;
        this.creditos = creditos;
        this.correo = correo;
        this.franja = franja;
        this.students = students;
    }

    public int getId_group() {
        return id_group;
    }

    public void setId_group(int id_group) {
        this.id_group = id_group;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getFranja() {
        return franja;
    }

    public void setFranja(String franja) {
        this.franja = franja;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
