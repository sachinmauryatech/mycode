import java.util.Scanner;

public class Practice24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Base of cylinder::");
        int r = sc.nextInt();
        System.out.println("Enter height of cylinder::");
        int h = sc.nextInt();
        double vol = 3.17 * r * r * h;
        System.out.println("Volume of cylinder::" + vol);
        sc.close();
    }
}
