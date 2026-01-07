package topicThree;

import java.util.Scanner;

public class MixedInput_07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("My name is " + name + " and I'm " + age + " years old");
    }

}

/*

Issue: Previously I did not include sc.nextLine() in the middle and after entering the age, the program automatically
printed 2 lines.

The Problem: The "Ghost" Newline
When you type your age (e.g., 25) and press Enter, you are actually sending two things to the input buffer:

The number: 25

The newline character: \n (created by the Enter key)

The method nextInt() is only designed to pick up the number. It leaves that \n character sitting there in the buffer.
When your code reaches nextLine(), that method is designed to read everything until it hits a newline. It sees the \n
left over from the age, thinks you've already pressed Enter, and returns an empty string.

 */
