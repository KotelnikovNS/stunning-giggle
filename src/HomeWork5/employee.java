package HomeWork5;

public class employee {
    private String Name;
    private String grade;
    private String email;
    private String phone;
    private int salary;
    private int birthYear;
    private static int year = 2021;

    public employee(String Name, String grade, String email, String phone, int salary, int birthYear) {
        this.Name = Name;
        this.grade = grade;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.birthYear = birthYear;
    }
    public String employeeInfo() {
        return this.Name + this.grade + this.email + this.phone + this.salary + this.birthYear;
    }

    public String getName() {
        return Name;
    }
    public String getGrade() {
        return grade;
    }
    public String getEmail() {
        return email;
    }
    public String getPhone() {
        return phone;
    }
    int getSalary () {return salary;}
    int getAge () {return year - birthYear;}
}