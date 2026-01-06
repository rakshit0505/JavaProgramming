package topicTwo;

public class DataLossDemonstration_09 {

    public static void main(String[] args) {
        int a = 7;
        int b = 2;
        double c = a / b;
        System.out.println("Result: " + c);

        System.out.println();
        System.out.println("Expected Result was 3,5, but we are dividing 2 integers and the result we get is also integer \n" +
                "because we are performing integer division. We are assigning the value we get after integer division to a \n" +
                "double, therefore the value is " + c + ". We are not involving double in the operation we involving it \n" +
                "after the operation happens hence the result what we get is being printed as double.");

    }

}
