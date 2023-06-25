package model;

import java.util.Scanner;

public class FullTime extends Employee{
    private int workDay;

    public int getWorkDay() {
        return workDay;
    }

    public void setWorkDay(int workDay) {
        this.workDay = workDay;
    }

    @Override
    public float getSalary() {
        return workDay*1200000 + 800000;
    }

    @Override
    public void showInfor() {

    }
    public void inputFullTime(Scanner sc){
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
        return "FullTime{" +
                "ID: " + super.getId() +
                "Name: " + super.getName() +
                "Date of birth: " + super.getDateOfBirth() +
                "Work day: " + getWorkDay() +
                "Salary: " + getSalary() +
                '}';
    }
}
