import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any number::");
        int a = sc.nextInt();
        System.out.print("Enter Another number::");
        int b = sc.nextInt();
        if (a > b) {
            System.out.print(a + " is largest number");
        } else {
            System.out.print(b + " is largest number");
        }
        sc.close();
    }
}
