import java.util.Scanner;

public class Practice19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of rectangle::");
        int l = sc.nextInt();
        System.out.println("Enter breadth of rectangle::");
        int b = sc.nextInt();
        int peri = 2 * (l + b);
        System.out.println("Perimeter of rectangle::" + peri);
        sc.close();
    }
}
