import java.util.Scanner;

public class _1DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a;
        a = new int[5]; // Declaration of 1-dimesional array
        int b[] = new int[6]; // Declaration of 1-dimesional array
        b[0] = 12;
        b[1] = 11;
        b[2] = 3;
        b[3] = 4;
        b[4] = 10;
        b[5] = 11;
        System.out.println("Taking input in array::");
        for (int i = 0; i < 5; i++) {
            System.out.println("a" + "[" + i + "]" + " " + "=");
            a[i] = sc.nextInt(); // Taking Input in 1-D Array
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("a" + "[" + i + "]" + " " + "=" + a[i]); // Output pf 1-D Array
        }
        for (int i = 0; i < 6; i++) {
            System.out.println("a" + "[" + i + "]" + " " + "=" + b[i]); // Output pf 1-D Array
        }
        sc.close();
    }
}
