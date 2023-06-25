package model;

public abstract class Employee {
    private String id;
    private String name;
    private String dateOfBirth;
    private float employeeSalary;

    public Employee(String id, String name, String dateOfBirth, float salary) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.employeeSalary = salary;
    }

    public Employee(){}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public float getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(float employeeSalary) {
        this.employeeSalary = employeeSalary;
    }
    public abstract float getSalary();
    public abstract void showInfor();
}
