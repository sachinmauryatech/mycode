import java.util.Scanner;

public class Practice15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Side of Traingle::");
        float a = sc.nextFloat();
        double area = (Math.sqrt(3) * a * a) / 4;
        System.out.println("Area of Equliateral Traingle::" + area);
        sc.close();
    }
}
