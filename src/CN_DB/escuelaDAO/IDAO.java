package CN_DB.escuelaDAO;

import java.util.ArrayList;
import  CN_DB.escuelaDAO.EmployeesDAO;



public interface IDAO {
    public String registrar (EmployeesDAO ejecutivo);
    public ArrayList<EmployeesDAO> consultar_todos();
    public String eliminar (EmployeesDAO ejecutivo);
    public String update (EmployeesDAO ejecutivo);
    public EmployeesDAO leer (int clave);
}
