class Demo {
    public int add(int n1, int n2) {
        int res = n1 + n2;
        return res;
    }

    public int mult(int n1, int n2) {
        int res = n1 * n2;
        return res;
    }

    public int div(int n1, int n2) {
        int res = n1 / n2;
        return res;
    }

    public int sub(int n1, int n2) {
        int res = n1 - n2;
        return res;
    }
}

public class Calc {
    public static void main(String[] args) {
        Demo obj = new Demo();
        System.out.println(obj.add(4, 5));
        System.out.println(obj.mult(4, 5));
        System.out.println(obj.div(6, 5));
        System.out.println(obj.sub(4, 5));
    }

}
