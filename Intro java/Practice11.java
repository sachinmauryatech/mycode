import java.util.Scanner;

public class Practice11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of rectangle::");
        float l = sc.nextFloat();
        System.out.println("Enter breadth of rectangle::");
        float w = sc.nextFloat();
        float area = l * w;
        System.out.println("Area of rectangle::" + area);
        sc.close();
    }

}
