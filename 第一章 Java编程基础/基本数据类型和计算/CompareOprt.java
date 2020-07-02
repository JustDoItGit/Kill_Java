package 基本数据类型和计算;

public class CompareOprt {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 15;
        byte c = 10;

        System.out.println(a > b);
        System.out.println(a >= b);
        System.out.println(a < b);
        System.out.println(a <= b);
        System.out.println(a != b);

        System.out.println(a != c);
        System.out.println(a >= c);
        System.out.println(a <= c);
        System.out.println(a == b);
        System.out.println(a == c);
    }
}
