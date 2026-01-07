package topicThree;

import java.util.Scanner;

public class SimpleCalculator_05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the 1st number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the 2nd number: ");
        int num2 = sc.nextInt();

        System.out.println("Result of Addition: " + (num1 + num2));
        System.out.println("Result of Subtraction: " + (num1 - num2));
        System.out.println("Result of Multiplication: " + (num1 * num2));
        System.out.println("Result of Division: " + (num1 / num2));
    }

}
