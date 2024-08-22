
package java.escuelaDAO;

import java.escuelaDTO.AlumnoDTO;
import java.escuelaUtil.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class AlumnoDAO implements IDAO{
    private PreparedStatement psmt = null;
    private Connection cnn = null;
    private ResultSet rs = null;
            
    public AlumnoDAO() {
        cnn = Conexion.getInstance();
    }

    
    @Override
    public String registrar(AlumnoDTO alumno) {
        int resultado = 0;
        String salida = null;
        try {
            psmt = cnn.prepareStatement("INSERT INTO alumnos VALUES (null, ?, ?, ?,?)");
            psmt.setString(1, alumno.getNombre());
            psmt.setInt(2, alumno.getEdad());
            psmt.setInt(3, alumno.getCursoActual());
            psmt.setString(4, alumno.getEmail());
            resultado = psmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AlumnoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        if(resultado != 0){
            salida = "El alumno se registro exitosamente";
        }else{
            salida = "No se registro";
        }
        return salida;
    }

    @Override
    public ArrayList<AlumnoDTO> consultarTodos() {
        ArrayList<AlumnoDTO> lista = null;
        lista = new ArrayList();
        try {
            psmt = cnn.prepareStatement("SELECT * FROM alumnos");
            rs = psmt.executeQuery();
            while(rs.next()){
                AlumnoDTO alumno = new AlumnoDTO();
                alumno.setClaveAlumno(rs.getInt("clave_alumno"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setEdad(rs.getInt("edad"));
                alumno.setCursoActual(rs.getInt("curso_actual"));
                alumno.setEmail(rs.getString("email"));
                lista.add(alumno);
            }
            rs.close();
            psmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(AlumnoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lista;
    }

    @Override
    public String eliminar(AlumnoDTO alumno) {
        int resultado = 0;
        String salida = null;
        try {
            psmt = cnn.prepareStatement("DELETE FROM alumnos WHERE clave_alumno = ?");
            psmt.setInt(1, alumno.getClaveAlumno());
            resultado = psmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AlumnoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        if(resultado != 0){
            salida = "El alumno fue eliminado exitosamente";
        }else{
            salida = "No se Elimino";
        }
        return salida;
    }

    @Override
    public String update(AlumnoDTO alumno) {
        int resultado = 0;
        String salida = null;
        try {
            psmt = cnn.prepareStatement("UPDATE alumnos SET nombre = ?, edad = ?, curso_actual=?, email=? WHERE clave_alumno = ?");
            psmt.setString(1, alumno.getNombre());
            psmt.setInt(2, alumno.getEdad());
            psmt.setInt(3, alumno.getCursoActual());
            psmt.setString(4, alumno.getEmail());
            psmt.setInt(5, alumno.getClaveAlumno());
            
            resultado = psmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AlumnoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        if(resultado != 0){
            salida = "El alumno fue editado exitosamente";
        }else{
            salida = "No se edito";
        }
        return salida;
    }

    @Override
    public AlumnoDTO leer(int clave) {
        AlumnoDTO alumno = null;
        alumno = new AlumnoDTO();
        try {
            psmt = cnn.prepareStatement("SELECT * FROM alumnos WHERE clave_alumno = ?");
            psmt.setInt(1, clave);
            rs = psmt.executeQuery();
            while(rs.next()){
            alumno.setClaveAlumno(rs.getInt("clave_alumno"));
            alumno.setNombre(rs.getString("nombre"));
            alumno.setEdad(rs.getInt("edad"));
            alumno.setCursoActual(rs.getInt("curso_actual"));     
            alumno.setEmail(rs.getString("email"));   
            }
            rs.close();
            psmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(AlumnoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return alumno;
    }
    
}
