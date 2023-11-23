import java.util.Scanner;

public class Practice10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Base of traingle::");
        float b = sc.nextFloat();
        System.out.println("Height of traingle::");
        float h = sc.nextFloat();
        float area = (b * h) / 2;
        System.out.println("Area of traingle::" + area);
        sc.close();
    }
}
