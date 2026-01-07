package topicThree;

import java.util.Scanner;

public class ReadFullName_04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String name = sc.nextLine();
        System.out.println("My name is " + name);
    }

}
