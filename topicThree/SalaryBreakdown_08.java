package topicThree;

import java.util.Scanner;

public class SalaryBreakdown_08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter the Basic Salary: ");
        double basicSalary = sc.nextDouble();
        double hra = basicSalary * 0.20;
        double da = basicSalary * 0.10;
        double grossSalary = basicSalary + hra + da;

        System.out.println("Hi " + name + ", your salary breakdown is as below:");
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("House Rental Allowance: " + hra);
        System.out.println("Dearness Allowance: " + da);
        System.out.println("Gross Salary: " + grossSalary);
    }

}
