class Overloading {
    public int add(int n1, int n2) {
        int res = n1 + n2;
        return res;
    }

    public int add(int n1, int n2, int n3) {
        int res = n1 + n2 + n3;
        return res;
    }

    public double add(double n1, double n2, double n3) {
        double res = n1 + n2 + n3;
        return res;
    }

}

public class demo1 {
    public static void main(String[] args) {
        Overloading obj = new Overloading();
        System.out.println(obj.add(2, 3));
        System.out.println(obj.add(3, 4, 5));
        System.out.println(obj.add(2.50, 4.00, 3.00));
    }
}