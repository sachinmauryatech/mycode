import java.util.Scanner;

public class Practice27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height of Cylinder::");
        int h = sc.nextInt();
        System.out.println("Enter radius of Cylinder::");
        int r = sc.nextInt();
        double area = 2 * 3.17 * r * h + 2 * 3.17 * r * r;
        System.out.println("Surface Area of Cylinder::" + area);
        sc.close();

    }
}
