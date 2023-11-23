import java.util.*;

public class Practice9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter radius of Circle::");
        float r = sc.nextFloat();
        float area = (22 * r * r) / 7;
        System.out.println("Area of circle::" + area);
        sc.close();
    }

}
