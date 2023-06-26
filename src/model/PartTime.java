package model;

import java.util.Scanner;

public class PartTime extends Employee{
    private int workDay;

    public int getWorkDay() {
        return workDay;
    }

    public void setWorkDay(int workDay) {
        this.workDay = workDay;
    }

    @Override
    public float getSalary() {
        return workDay*500000;
    }

    @Override
    public void showInfor() {
        System.out.println("PartTime{" +
                "ID: " + super.getId() +"\n" +
                "Name: " + super.getName() +"\n" +
                "Date of birth: " + super.getDateOfBirth() +"\n" +
                "Work day: " + getWorkDay() +"\n" +
                "Salary: " + getSalary() + "}");
    }
    public void inputPartTime(Scanner sc){
        System.out.println("ID: ");
        setId(sc.next());
        sc.nextLine();
        System.out.println("Name: ");
        setName(sc.nextLine());
        System.out.println("Date of birth: ");
        setDateOfBirth(sc.next());
        sc.nextLine();
        System.out.println("Work day: ");
        setWorkDay(sc.nextInt());
    }

    @Override
    public String toString() {
        return "PartTime{" +
                "ID: " + super.getId() +
                "Name: " + super.getName() +
                "Date of birth: " + super.getDateOfBirth() +
                "Work day: " + getWorkDay() +
                "Salary: " + getSalary() +
                '}';
    }
}
