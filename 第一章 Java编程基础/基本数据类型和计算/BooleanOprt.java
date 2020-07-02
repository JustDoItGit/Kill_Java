package 基本数据类型和计算;

public class BooleanOprt {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        System.out.println(a && b);
        System.out.println(a & b);
        System.out.println(a || b);
        System.out.println(a | b);

        System.out.println(a || (10 / 0 > 1));
        System.out.println(a | (10 / 0 > 1));
    }
}
