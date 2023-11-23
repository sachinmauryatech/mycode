import java.util.Scanner;

public class Practice12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Base of Isosceles traingle::");
        float b = sc.nextFloat();
        System.out.println("Height of Isosceles traingle::");
        float h = sc.nextFloat();
        float area = (b * h) / 2;
        System.out.println("Area of Isosceles traingle::" + area);
        sc.close();
    }
}
