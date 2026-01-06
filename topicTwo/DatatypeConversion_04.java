package topicTwo;

public class DatatypeConversion_04 {

    public static void main(String[] args) {
        int a = 10;
        System.out.println("Before Conversion: Value = " + a);

        double b = a;
        System.out.println("After Conversion: Value = " + b);

        double c = 10.55;
        System.out.println("Before Conversion: Value = " + c);

        int d = (int) c;
        System.out.println("After Conversion: Value = " + d);

    }

}
