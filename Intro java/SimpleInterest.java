import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter prinicipal amount:");
        int p = sc.nextInt();
        System.out.println("Enter time duration:");
        int t = sc.nextInt();
        System.out.println("Enter Rate of interest:");
        float r = sc.nextFloat();
        float si = (p * r * t) / 100;
        System.out.println(si);
        sc.close();
    }
}
