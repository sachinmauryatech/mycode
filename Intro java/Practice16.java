import java.util.Scanner;

public class Practice16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of circle::");
        float r = sc.nextFloat();
        float peri = 2 * 22 * r / 7;
        System.out.println("Perimeter of Circle::" + peri);
        sc.close();
    }
}
