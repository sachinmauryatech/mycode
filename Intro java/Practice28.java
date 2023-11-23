import java.util.Scanner;

public class Practice28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Side of cube::");
        int a = sc.nextInt();
        int area = 6 * a * a;
        System.out.println("Total Surface area of cube::" + area);
        sc.close();
    }
}
