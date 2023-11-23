import java.util.Scanner;

public class Practice22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of cone::");
        int r = sc.nextInt();
        System.out.println("Enter height of cone::");
        int h = sc.nextInt();
        double vol = (3.17 * r * r * h) / 3;
        System.out.println("Volume of Cone::" + vol);
        sc.close();
    }
}
