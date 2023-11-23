import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Indian Rupees To convert it in $USD::");
        double a = sc.nextDouble();
        double res = a * 0.0121;
        System.out.print("$USD::" + res);
        sc.close();
    }
}
