import java.util.Scanner;

public class GfgPractice {

    public static void main(String[] args)

    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        /*
         * Your code here
         * for (int i = n; i > 0; i--) {
         * for (int j = n; j > 0; j--) {
         * for (int k = 0; k < i; k++) {
         * System.out.print(j + " ");
         * }
         * }
         * System.out.print("$");
         * }
         */
        int count = n;
        int i = 2;
        while (i < 12) {
            System.out.print(count + " ");
            count = n * i;
            i++;
        }
    }
}
