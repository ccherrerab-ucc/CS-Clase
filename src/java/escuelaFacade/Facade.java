
package java.escuelaFacade;

import escuelaDAO.AlumnoDAO;
import escuelaDTO.AlumnoDTO;
import java.util.ArrayList;


public class Facade implements IFacade{
    AlumnoDAO dao;
    LogicaNegocio ln;
    public Facade() {
        dao = new AlumnoDAO();
        ln = new LogicaNegocio();
    }

    @Override
    public String crearAlumno(AlumnoDTO alumno) {
        ln.setAlumno(alumno);
        ln.validarCorreo();
        return dao.registrar(alumno);
        
    }

    @Override
    public ArrayList<AlumnoDTO> listarAlumnos() {
        return dao.consultarTodos();
    }

    @Override
    public String eliminarAlumnos(AlumnoDTO alumno) {
        return dao.eliminar(alumno);
    }

    @Override
    public String cambiarDatos(AlumnoDTO alumno) {
        ln.setAlumno(alumno);
        ln.validarCorreo();
        return dao.update(alumno);
    }

    @Override
    public AlumnoDTO buscarAlumno(int clave) {
        return dao.leer(clave);
    }
    
}
