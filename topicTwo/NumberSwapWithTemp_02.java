package topicTwo;

public class NumberSwapWithTemp_02 {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        System.out.println("Numbers before swapping: a = " + a + ", b =  " + b);

        int c = a;
        a = b;
        b = c;
        System.out.println("Numbers after swapping: a = " + a + ", b =  " + b);

    }

}
