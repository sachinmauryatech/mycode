class caclcu {
    public void show(byte num) {
        System.out.println("byte" + num);
    }

    public void show(short num) {
        System.out.println("Short" + num);
    }

    public void show(int num) {
        System.out.println("int" + num);
    }

    public void show(long num) {
        System.out.println("long" + num);
    }

    public void show(float num) {
        System.out.println("float" + num);
    }

    public void show(double num) {
        System.out.println("double" + num);
    }
}

public class demo4 {
    public static void main(String[] args) {
        caclcu obj = new caclcu();
        byte b = 2;
        obj.show(b);

    }
}