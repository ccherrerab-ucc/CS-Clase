package CN_DB.escuelaDAO;

import java.util.ArrayList;

public interface IDAO {
    String registrar(EmployeesDTO employeesDTO);
    ArrayList<EmployeesDTO> consultar_todos();
    String eliminar(EmployeesDTO employeesDTO);
    String update(EmployeesDTO employeesDTO);
    EmployeesDTO leer(int clave);
}

