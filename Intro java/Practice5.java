import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any number to print Fabonacci series::");
        int n = sc.nextInt();
        int a = 0, b = 1;
        System.out.print(a + b + "\n");
        for (int i = 0; a + b < n;) {

            i = a + b;
            System.out.print(i + "\n");
            a = b;
            b = i;
        }
        sc.close();
    }
}
