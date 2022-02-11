package javapackage;

public class VariableDemo {

    static int k = 20;

    public static void main(String[] args) {
        VariableDemo obj = new VariableDemo();
        obj.method1();
        obj.method2();
        System.out.println("Value of k is: " + k);
    }

    public void method1() {
        int j = 10;
        System.out.println("Value of j is: " + j);
        System.out.println("Value of k is: " + k);
    }

    public void method2(){
        System.out.println("Value of k is: " + k);
    }
}
