package javapackage;

public class OperatorDemo {

    public static void main(String[] args) {
        int a = 5, b = 10;
        int c = a + b;
        System.out.println("Addition is :" + c);
        System.out.println("Subtraction is :" + (b - a));
        System.out.println("Multiplication is :" + a * b);
        System.out.println("Division is :" + b / a);
        System.out.println("Modules is :" + (b % a));
        System.out.println("Incrementation is :" + ++a);
        System.out.println("A is :" + a);
        System.out.println("Decrement is :" + --a);
        System.out.println("Decrement is :" + a--);

        System.out.println(a == b); //false
        System.out.println(a != b);//true
        System.out.println(a > b);//false
        System.out.println(a < b);//true

        System.out.println((a < b) && (a != b));

        String d;
        d = (a < b) ? "This is true" : "This is NOT true";
        System.out.println(d);

        if (a < b) {
            System.out.println("This is true");
        } else {
            System.out.println("This is NOT true");
        }

        OperatorDemo obj = new OperatorDemo();
        System.out.println(obj instanceof OperatorDemo);//true
    }

}
