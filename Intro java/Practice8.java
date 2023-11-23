import java.lang.Math;

public class Practice8 {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 1634;
        for (int i = num1; i < num2; i++) {
            int temp, digit = 0, rem, sum = 0;
            temp = i;
            while (temp > 0) {
                temp = temp / 10;
                digit++;
            }
            temp = i;
            while (temp != 0) {
                rem = temp % 10;
                sum += (Math.pow(rem, digit));
                temp = temp / 10;
            }
            if (sum == i) {
                System.out.print("" + i + "is Armstrong number" + "\n");
            }
        }

    }
}
