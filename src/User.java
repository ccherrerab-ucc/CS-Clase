public class User {
    private int personID;
    private String fullName;
    private String occupationSTR;
    private String address;
    private double phone;
    private String email;

    public User(int personID, String fullName, String occupationSTR, String address, double phone, String email) {
        this.personID = personID;
        this.fullName = fullName;
        this.occupationSTR = occupationSTR;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public int getPersonID() {
        return personID;
    }

    public void setPersonID(int personID) {
        this.personID = personID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getOccupationSTR() {
        return occupationSTR;
    }

    public void setOccupationSTR(String occupationSTR) {
        this.occupationSTR = occupationSTR;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getPhone() {
        return phone;
    }

    public void setPhone(double phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
