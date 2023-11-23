import java.util.Scanner;

public class Practice23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Base of prism::");
        int b = sc.nextInt();
        System.out.println("Enter height of prism::");
        int h = sc.nextInt();
        int vol = b * h;
        System.out.println("Volume of Prism::" + vol);
        sc.close();
    }
}
