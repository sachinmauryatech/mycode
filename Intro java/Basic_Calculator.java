import java.util.Scanner;

public class Basic_Calculator {
    public static void main(String[] args) {
        double num1;
        double num2;
        double ans;
        char op;
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter two numbers:");
        num1 = reader.nextDouble();
        num2 = reader.nextDouble();
        System.out.print("\n Enter an operator(+,-,*,/):");
        op = reader.next().charAt(0);
        switch (op) {
            case '+':
                ans = num1 + num2;
                break;
            case '-':
                ans = num1 - num2;
                break;
            case '*':
                ans = num1 * num2;
                break;
            case '/':
                ans = num1 / num2;
                break;
            default:
                System.out.println("Enter! Enter correct operator");
                return;
        }
        System.out.println("The result is given as follows:");
        System.out.println(num1 + " " + op + " " + num2 + "=" + ans);
    }
}