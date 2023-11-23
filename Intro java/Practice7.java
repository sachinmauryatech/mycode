import java.util.Scanner;

public class Practice7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number to check armstrong::");
        int a = sc.nextInt();
        int temp, digit = 0, sum = 0, last;
        temp = a;
        while (temp > 0) {
            temp = temp / 10;
            digit++;
        }
        temp = a;
        while (temp > 0) {
            last = temp % 10;
            sum += (Math.pow(last, digit));
            temp = temp / 10;
        }
        if (sum == a) {
            System.out.print(a + " is Armstrong");
        } else {
            System.out.print(a + " is not Armstrong");
        }
        sc.close();
    }
}