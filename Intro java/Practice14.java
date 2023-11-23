import java.util.Scanner;

public class Practice14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Diagonal of rhombus::");
        float d1 = sc.nextFloat();
        System.out.println("Enter another diagonal of rhombus::");
        float d2 = sc.nextFloat();
        float area = (d1 * d2) / 2;
        System.out.println("Area of rhombus::" + area);
        sc.close();
    }
}
