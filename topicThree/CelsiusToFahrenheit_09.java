package topicThree;

import java.util.Scanner;

public class CelsiusToFahrenheit_09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the temperature in Celsius: ");
        int celsius = sc.nextInt();
        double fahrenheit = (double) (celsius * 9 / 5) + 32;
        System.out.println("The temperature " + celsius + " when converted to Fahrenheit is " + fahrenheit);
    }

}
