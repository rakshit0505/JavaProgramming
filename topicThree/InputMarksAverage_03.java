package topicThree;

import java.util.Scanner;

public class InputMarksAverage_03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the marks of subject 1: ");
        int marks1 = sc.nextInt();
        System.out.print("Enter the marks of subject 2: ");
        int marks2 = sc.nextInt();
        System.out.print("Enter the marks of subject 3: ");
        int marks3 = sc.nextInt();

        System.out.println("Average marks = " + ((marks1 + marks2 + marks3) / 3));
        sc.close();
    }

}
