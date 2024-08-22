
package java.escuelaFacade;

import escuelaDTO.AlumnoDTO;


public class LogicaNegocio {
    
   private AlumnoDTO alumno;

    public LogicaNegocio(AlumnoDTO alumno) {
        this.alumno = alumno;
    }

    public LogicaNegocio() {
    }

    public AlumnoDTO getAlumno() {
        return alumno;
    }

    public void setAlumno(AlumnoDTO alumno) {
        this.alumno = alumno;
    }
   
    public void validarCorreo(){
        String nuevoCorreo=null;
        if(alumno.getEdad()<=10){
            nuevoCorreo = alumno.getNombre().replace(" ","")+"@udelavida.edu.co";
            alumno.setEmail(nuevoCorreo);
        }
        
    }
}
