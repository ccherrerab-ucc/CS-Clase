package CN_DB.escuelaDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import CN_DB.empresaUtil.Conexion;



public abstract class EmployeesDAO implements IDAO {

    private PreparedStatement psmt = null;

    private Connection cnn = null;

    private ResultSet rs = null;

    public EmployeesDAO(){
        cnn = Conexion.getInstance();
    }

}
