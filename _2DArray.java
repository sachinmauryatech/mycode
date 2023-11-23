import java.util.Scanner;

public class _2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int[][] b = new int[1][1]; // 2D Array Declaration
        int[][] a = new int[2][]; // jaged array Declaration
        a[0] = new int[4]; // Jaged Array column size Declaraion
        a[1] = new int[3]; // Jaged Array column size Declaraion
        int A[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7 },
                { 8, 9, 0, 1, 10 }
        };
        System.out.println("Input element in array::");
        int c = a.length;
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        for (int d[] : a) {
            for (int e : d) {
                System.out.print(e + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        for (int d[] : A) {
            for (int e : d) {
                System.out.print(e + " ");
            }
            System.out.println();
        }
        sc.close();

    }
}
