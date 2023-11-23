import java.util.Scanner;

public class Practice20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Side of square::");
        int a = sc.nextInt();
        int peri = 4 * a;
        System.out.println("Perimeter of Square::" + peri);
        sc.close();
    }
}
