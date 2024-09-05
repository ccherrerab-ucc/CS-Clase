package CN_DB.escuelaDAO;

import java.sql.*;

import CN_DB.empresaUtil.Conexion;



public abstract class EmployeesDAO implements IDAO {

    private PreparedStatement psmt = null;

    private Connection cnn = null;

    private ResultSet rs = null;

    public EmployeesDAO(){
        cnn = Conexion.getInstance();
    }


    public String registrar(EmployeesDTO ejecutivo) {
        int resultado = 0;
        String salida = null;
        try {
            psmt = cnn.prepareStatement("INSERT INTO alumnos (NIT, name, first_surname, second_surname, id_user, first_level, second_level, entry_date, delete, turn, schedule, id_area, id_departament, id_position, id_workcenter, rest_day) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);");
            psmt.setString(1, ejecutivo.getNIT());
            psmt.setString(2, ejecutivo.getName());
            psmt.setString(3, ejecutivo.getFirstSurname());
            psmt.setString(4, ejecutivo.getSecondSurname());
            psmt.setInt(5, ejecutivo.getIdUser());
            psmt.setString(6, ejecutivo.getFirstLevel());
            psmt.setString(7, ejecutivo.getSecondLevel());
            psmt.setDate(8, Date.valueOf(ejecutivo.getEntryDate()));
            psmt.setString(9, ejecutivo.getDelete());
            psmt.setString(10, ejecutivo.getTurn());
            psmt.setString(11, ejecutivo.getSchedule());
            psmt.setInt(12, ejecutivo.getIdArea());
            psmt.setInt(13, ejecutivo.getIdDepartament());
            psmt.setInt(14, ejecutivo.getIdPosition());
            psmt.setInt(15, ejecutivo.getIdWorkcenter());
            psmt.setInt(16, ejecutivo.getRestDay());
            resultado = psmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error de MySQL: " + e.getMessage());
            throw new RuntimeException(e);
        }
        if (resultado != 0) {
            salida = "El ejecutivo se registró exitosamente";
        } else {
            salida = "No se registró";
        }
        return salida;
    }

}
