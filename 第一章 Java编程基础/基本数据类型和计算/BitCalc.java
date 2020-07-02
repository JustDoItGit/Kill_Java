package 基本数据类型和计算;

public class BitCalc {
    public static void main(String[] args) {
        int a = 0xF8;
        int b = 0xF4;
        int c = 0xFF;
        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(a ^ b);

        System.out.println(~c);
    }
}
