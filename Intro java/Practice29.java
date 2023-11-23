import java.util.Scanner;

public class Practice29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number to print fibonacci series upto thi series::");
        int n = sc.nextInt();
        int a = 0, b = 1;
        int c = 0;
        System.out.println(c);
        c = a + b;
        System.out.println(c);
        for (int i = 0; c < n; i++) {
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;

        }
    }
}
