package topicTwo;

public class OperatorPrecedence_06 {

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = a + b * 2;
        System.out.println("Value of c: " + c);
        System.out.println("At first the expected result could be 30, but since the operator precedence comes into picture \n" +
                "it follows the BODMAS rule and therefore the multiplication happens first and then the addition \n" +
                "and hence the result is " + c);
    }

}
