
package java.escuelaDTO;


public class AlumnoDTO {
    
    private int claveAlumno;
    private String nombre;
    private int edad;
    private int cursoActual;
    private String email;

    public AlumnoDTO(int claveAlumno, String nombre, int edad, int cursoActual,String email) {
        this.claveAlumno = claveAlumno;
        this.nombre = nombre;
        this.edad = edad;
        this.cursoActual = cursoActual;
        this.email = email;
    }
    public AlumnoDTO(int claveAlumno){
        this.claveAlumno = claveAlumno;
    }
    public AlumnoDTO(){}

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the claveAlumno
     */
    public int getClaveAlumno() {
        return claveAlumno;
    }

    /**
     * @param claveAlumno the claveAlumno to set
     */
    public void setClaveAlumno(int claveAlumno) {
        this.claveAlumno = claveAlumno;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the cursoActual
     */
    public int getCursoActual() {
        return cursoActual;
    }

    /**
     * @param cursoActual the cursoActual to set
     */
    public void setCursoActual(int cursoActual) {
        this.cursoActual = cursoActual;
    }

    @Override
    public String toString() {
        return "AlumnoDTO{" + "claveAlumno=" + claveAlumno + ", nombre=" + nombre + ", edad=" + edad + ", cursoActual=" + cursoActual + ", email=" + email + '}';
    }
    
    
}
