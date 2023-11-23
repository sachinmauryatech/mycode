import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a::");
        int a = sc.nextInt();
        System.out.print("Enter value of b::");
        int b = sc.nextInt();
        int res;
        int res1;

        if (a > b) {
            res = a - b;
            res1 = a / b;
        } else {
            res = a + b;
            res1 = a * b;
        }
        System.out.println("Operations on a & b:: " + res + "\n" + res1);
        sc.close();
    }
}
