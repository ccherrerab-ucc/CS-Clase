
package java.escuelaDAO;

import java.escuelaDTO.AlumnoDTO;
import java.util.ArrayList;


public interface IDAO {
    public String registrar(AlumnoDTO alumno);
    public ArrayList<AlumnoDTO> consultarTodos();
    public String eliminar(AlumnoDTO alumno);
    public String update(AlumnoDTO alumno);
    public AlumnoDTO leer(int clave);
}
