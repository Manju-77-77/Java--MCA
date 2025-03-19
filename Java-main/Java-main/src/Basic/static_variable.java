package Basic;

public class static_variable {
    static int a = 100;
    int b = 200;

    public static void main(String[] args) {
        System.out.println("A value: " + a);
        static_variable stv = new static_variable();
        System.out.println("B Value: " + stv.b);
    }
}
