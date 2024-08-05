import java.util.Date;

public class Enrollment {
    private int idEnrollment;
    private int codeSubject;
    private Date fecha;
    private int status;
    private Student estudiante;
    private Group grupo;

    public Enrollment(int idEnrollment, int codeSubject, Date fecha, int status, Student estudiante, Group grupo) {
        this.idEnrollment = idEnrollment;
        this.codeSubject = codeSubject;
        this.fecha = fecha;
        this.status = status;
        this.estudiante = estudiante;
        this.grupo = grupo;
    }

    public int getIdEnrollment() {
        return idEnrollment;
    }

    public void setIdEnrollment(int idEnrollment) {
        this.idEnrollment = idEnrollment;
    }

    public int getCodeSubject() {
        return codeSubject;
    }

    public void setCodeSubject(int codeSubject) {
        this.codeSubject = codeSubject;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Student getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Student estudiante) {
        this.estudiante = estudiante;
    }

    public Group getGrupo() {
        return grupo;
    }

    public void setGrupo(Group grupo) {
        this.grupo = grupo;
    }
}
