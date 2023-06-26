package utils;

import model.Employee;
import model.FullTime;
import model.PartTime;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerFunction {
    static List<Employee> listEmployee = new ArrayList<>();
    public static void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input 1 for Full-time employee or 2 for Part-time employee");
        int choice = sc.nextInt();
        switch (choice){
            case 1: {
                FullTime fullTime = new FullTime();
                fullTime.inputFullTime(sc);
                listEmployee.add(fullTime);
                break;
            }
            case 2: {
                PartTime partTime = new PartTime();
                partTime.inputPartTime(sc);
                listEmployee.add(partTime);
                break;
            }
        }
    }
    public static void showAllEmployee(){
        for (int i = 0; i< listEmployee.size(); i++) {
            listEmployee.get(i).showInfor();
        }
    }
    public static void updateEmployeeById(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input ID need to update:");
        String newID = sc.next();
        sc.nextLine();
        for (int i = 0; i < listEmployee.size(); i++){
            if (listEmployee.get(i).getId().equals(newID)){
                System.out.println("Input 1 for Full-time employee or 2 for Part-time employee");
                int choice = sc.nextInt();
                switch (choice){
                    case 1: {
                        FullTime fullTime = new FullTime();
                        fullTime.inputFullTime(sc);
                        listEmployee.set(i,fullTime);
                        break;
                    }
                    case 2: {
                        PartTime partTime = new PartTime();
                        partTime.inputPartTime(sc);
                        listEmployee.set(i,partTime);
                        break;
                    }
                }
            }
        }
    }
    public static void deleteEmployeeById(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input ID need to delete:");
        String newID = sc.next();
        sc.nextLine();
        for (int i = 0; i < listEmployee.size(); i++){
            if (listEmployee.get(i).getId().equals(newID)) {
                listEmployee.remove(listEmployee.get(i));
            }
        }
    }
    public static void sortName(){
        for (int i = 0; i < listEmployee.size(); i++){
            listEmployee.sort((o1, o2) ->
                    o1.getName().compareTo(o2.getName()));
        }
    }
    public static float getTotalSalaryOfAllEmployee(){
        float totalSalary = 0;
        for (int i = 0; i < listEmployee.size(); i++){
            totalSalary += listEmployee.get(i).getSalary();
        }
        return totalSalary;
    }
    public static void printMenu(){
        System.out.println("1. Input employee (Full-time and part-time)");
        System.out.println("2. Show payroll");
        System.out.println("3. Update or edit an employee by ID");
        System.out.println("4. Delete an employee by ID");
        System.out.println("5. Show total salary");
        System.out.println("6. Exit");
    }
}
