package CN_DB.escuelaDAO;

import java.util.ArrayList;
import  CN_DB.escuelaDAO.EmployeesDAO;



public interface IDAO {
    public String registrar (EmployeesDAO employeesDTO);
    public ArrayList<EmployeesDAO> consultar_todos();
    public String eliminar (EmployeesDAO employeesDTO);
    public String update (EmployeesDAO employeesDTO);
    public EmployeesDAO leer (int clave);
}
