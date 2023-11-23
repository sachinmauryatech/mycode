import java.util.Scanner;

public class Practice26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of Pyramid::");
        int l = sc.nextInt();
        System.out.println("Enter width of Pyramid::");
        int w = sc.nextInt();
        System.out.println("Enter height of Pyramid::");
        int h = sc.nextInt();
        double vol = (l * w * h) / 3;
        System.out.println("Volume of Pyramid::" + vol);
        sc.close();
    }
}
