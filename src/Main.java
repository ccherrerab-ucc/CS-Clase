import CN_DB.escuelaDAO.EmployeesDAO;
import CN_DB.escuelaDAO.EmployeesDTO;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia del DTO con los datos del empleado
        EmployeesDTO empleado = new EmployeesDTO();
        empleado.setNIT("123456789");
        empleado.setName("John");
        empleado.setFirstSurname("Doe");
        empleado.setSecondSurname("Smith");
        empleado.setIdUser(57);
        empleado.setFirstLevel("Junior");
        empleado.setSecondLevel("Mid");
        empleado.setEntryDate(LocalDate.now());
        empleado.setDelete("N");
        empleado.setTurn("Morning");
        empleado.setSchedule("8:00 - 17:00");
        empleado.setIdArea(1);
        empleado.setIdDepartament(2);
        empleado.setIdPosition(3);
        empleado.setIdWorkcenter(1);
        empleado.setRestDay(3);

        // Crear una instancia del DAO e intentar registrar al empleado
        EmployeesDAO employeesDAO = new EmployeesDAO();
        String resultado = employeesDAO.registrar(empleado);
        System.out.println(resultado); // Mostrar el resultado de la operación
    }
}