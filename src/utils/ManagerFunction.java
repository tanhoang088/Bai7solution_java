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
            if (listEmployee.get(i) instanceof FullTime) {
                System.out.println(((FullTime) listEmployee).toString());
            } else if (listEmployee.get(i) instanceof PartTime) {
                System.out.println(((FullTime) listEmployee).toString());
            }
        }
    }
    public static void updateEmployeeById(){

    }
}
