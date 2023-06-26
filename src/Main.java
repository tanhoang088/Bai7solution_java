import utils.ManagerFunction;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        while (true) {
            ManagerFunction.printMenu();
            choice = sc.nextInt();
            switch (choice){
                case 1: {
                    ManagerFunction.input();
                    break;
                }
                case 2: {
                    ManagerFunction.showAllEmployee();
                    break;
                }
                case 3: {
                    ManagerFunction.updateEmployeeById();
                    break;
                }
                case 4: {
                    ManagerFunction.deleteEmployeeById();
                    break;
                }
                case 5: {
                    System.out.println("Total Salary: " + ManagerFunction.getTotalSalaryOfAllEmployee());
                    break;
                }
                case 6: System.exit(0);
            }
        }
    }
}