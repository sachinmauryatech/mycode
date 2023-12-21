class Test {
    String name = "Rahul";
    int a = 2;

    public static void main(String[] args) {
        Test obj1 = new Test();
        Test obj2 = new Test();
        obj1.name = "Navin";
        System.out.println(obj1.name);
        System.out.println(obj1.a);
        System.out.println(obj2.name);
        System.out.println(obj2.a);
    }
}
