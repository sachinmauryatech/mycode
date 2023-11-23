import java.util.Scanner;

public class Practice17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side of Equliateral traingle::");
        int a = sc.nextInt();
        int Peri = 3 * a;
        System.out.println("Perimeter of Equilateral traingle::" + Peri);
        sc.close();
    }
}
