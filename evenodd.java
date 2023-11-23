
import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        System.out.print("Enter any number:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.print("Number is even");
        } else {
            System.out.print("Number is odd");
        }
        sc.close();
    }
}
