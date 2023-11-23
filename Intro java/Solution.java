import java.util.*;
import java.io.*;

class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int a = 0, b = 0, n = 0, c;
        for (int i = 0; i < t; i++) {
            a = in.nextInt();
            b = in.nextInt();
            n = in.nextInt();
        }
        if (n >= 0) {
            a = a + b;
            System.out.print(a + " ");
        }
        if (n > 0) {
            a = a + 2 * b;
            System.out.print(a + " ");
        }
        for (int i = 2; i <= n; i++) {
            i = i * i;
            System.out.println(a + i * b + " ");
        }
        in.close();
    }
}
