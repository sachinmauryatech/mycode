import java.util.Scanner;

public class practice6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Word::");
        String s = sc.nextLine();
        int length = s.length();
        String rev = "";
        for (int i = length - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        if (s.equals(rev)) {
            System.out.println(s + " is Palindrome String");
        } else {
            System.out.println(s + " is not Palindrome String");
        }
        sc.close();
    }
}
