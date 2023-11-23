import java.util.Scanner;

public class Practice21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Side of rhombus::");
        int a = sc.nextInt();
        int peri = 4 * a;
        System.out.println("Perimeter of rhombus::" + peri);
        sc.close();
    }
}
