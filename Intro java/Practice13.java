import java.util.Scanner;

public class Practice13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height of parallelogram::");
        float h = sc.nextFloat();
        System.out.println("Enter Base of parallelogram::");
        float b = sc.nextFloat();
        float area = h * b;
        System.out.println("Area of Parallelogram::" + area);
        sc.close();
    }
}
