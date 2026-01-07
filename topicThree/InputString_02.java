package topicThree;

import java.util.Scanner;

public class InputString_02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("My name is " + name + " and I'm " + age + " years old.");
        sc.close();
    }

}

/*
    next() reads only one word.
    If the name is "Rakshit Pawar" → only "Rakshit" is read.
    Hence use nextLine()
 */
