public class Operator {
    public static void main(String[] args) {
        int a = 134;
        int s = 0;

        s += a%10;
        a = a/10;
        s += a%10;
        a = a/10;
        s += a%10;

        System.out.println(s);

    }
}
