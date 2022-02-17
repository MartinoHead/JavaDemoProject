package flowControlPackage;

public class NasterdIfElse {
    public static void main(String[] args) {
        int n1 = 300, n2 = 40, n3 = 1000, largestNo;
        if (n1 > n2) {
            if (n1 > n3) {
                largestNo = n1;
            } else largestNo = n3;
        } else {
            if (n2 > n3) {
                largestNo = n2;
            } else {
                largestNo = n3;
            }
        }
        System.out.println("Largest number is :" + largestNo);

        if (n1 > n2 && n1 > n3) {
            System.out.println("Largest number is :" + n1);
        } else if (n2 > n1 && n2 > n3) {
            System.out.println("Largest number is :" + n2);
        } else {
            System.out.println("Largest number is :" + n3);
        }
    }
}
