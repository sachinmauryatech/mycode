import java.util.Scanner;

public class Practice18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base of parallelogram::");
        int b = sc.nextInt();
        System.out.println("Enter side of parallelogram::");
        int a = sc.nextInt();
        int peri = 2 * (a + b);
        System.out.println("Perimeter of parallelogram::" + peri);
        sc.close();
    }
}
