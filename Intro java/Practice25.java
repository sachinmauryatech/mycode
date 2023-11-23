import java.util.Scanner;

public class Practice25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of sphere::");
        int r = sc.nextInt();
        double vol = (4 * 3.17 * r * r) / 3;
        System.out.println("Volume of Sphere::" + vol);
        sc.close();
    }
}
