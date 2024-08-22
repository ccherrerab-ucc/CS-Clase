
package java.escuelaFacade;

import escuelaDTO.AlumnoDTO;
import java.util.ArrayList;


public interface IFacade {
    public String crearAlumno(AlumnoDTO alumno); 
    public ArrayList<AlumnoDTO> listarAlumnos();
    public String eliminarAlumnos(AlumnoDTO alumno);
    public String cambiarDatos(AlumnoDTO alumno);
    public AlumnoDTO buscarAlumno(int clave);
}
