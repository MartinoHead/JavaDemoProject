package javapackage;

public class DataTypeDemo {

    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = (10 > 2);

        System.out.println("Value of b1: " + b1);
        System.out.println("Value of b2: " + b2);
        System.out.println("Value of b2: " + b3);

        char ch1 = 'a';
        char ch2 = 'B';
        char ch3 = 65;

        System.out.println("Value of ch1: " + ch1);
        System.out.println("Value of ch2: " + ch2);
        System.out.println("Value of ch2: " + ch3);

        byte byte1 = 100;
        byte byte2 = -120;
        short short1 = 130;

        System.out.println("Value of byte1: " + byte1);
        System.out.println("Value of byte2: " + byte2);
        System.out.println("Value of short1: " + short1);

        int i = 1234567890;
        System.out.println("Value of i:" + i);

        long j = 999999999;
        System.out.println("Value of j:" + j);

        float fl1 = 10.5f;
        System.out.println("Value of fl1: " + fl1);

        double d = 123.23;
        System.out.println("Value of d: " + d);

        int i1 = (int) 123.12; //downcasting
        System.out.println("Value of i1: " + i1);

        double i2 =(double) 100; //upcasting
        System.out.println("Value of i2: " + i2);
    }
}