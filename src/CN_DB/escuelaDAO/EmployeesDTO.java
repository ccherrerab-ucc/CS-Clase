package CN_DB.escuelaDAO;

import java.time.LocalDate;

public class EmployeesDTO {
    private String NIT;
    private String name;
    private String firstSurname;
    private String secondSurname;
    private int idUser;
    private String firstLevel;
    private String secondLevel;
    private LocalDate entryDate;
    private String delete;
    private String turn;
    private String schedule;
    private int idArea;
    private int idDepartament;
    private int idPosition;
    private int idWorkcenter;
    private int restDay;

    // Getters and Setters
    public String getNIT() { return NIT; }
    public void setNIT(String NIT) { this.NIT = NIT; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getFirstSurname() { return firstSurname; }
    public void setFirstSurname(String firstSurname) { this.firstSurname = firstSurname; }

    public String getSecondSurname() { return secondSurname; }
    public void setSecondSurname(String secondSurname) { this.secondSurname = secondSurname; }

    public int getIdUser() { return idUser; }
    public void setIdUser(int idUser) { this.idUser = idUser; }

    public String getFirstLevel() { return firstLevel; }
    public void setFirstLevel(String firstLevel) { this.firstLevel = firstLevel; }

    public String getSecondLevel() { return secondLevel; }
    public void setSecondLevel(String secondLevel) { this.secondLevel = secondLevel; }

    public LocalDate getEntryDate() { return entryDate; }
    public void setEntryDate(LocalDate entryDate) { this.entryDate = entryDate; }

    public String getDelete() { return delete; }
    public void setDelete(String delete) { this.delete = delete; }

    public String getTurn() { return turn; }
    public void setTurn(String turn) { this.turn = turn; }

    public String getSchedule() { return schedule; }
    public void setSchedule(String schedule) { this.schedule = schedule; }

    public int getIdArea() { return idArea; }
    public void setIdArea(int idArea) { this.idArea = idArea; }

    public int getIdDepartament() { return idDepartament; }
    public void setIdDepartament(int idDepartament) { this.idDepartament = idDepartament; }

    public int getIdPosition() { return idPosition; }
    public void setIdPosition(int idPosition) { this.idPosition = idPosition; }

    public int getIdWorkcenter() { return idWorkcenter; }
    public void setIdWorkcenter(int idWorkcenter) { this.idWorkcenter = idWorkcenter; }

    public int getRestDay() { return restDay; }
    public void setRestDay(int restDay) { this.restDay = restDay; }
}