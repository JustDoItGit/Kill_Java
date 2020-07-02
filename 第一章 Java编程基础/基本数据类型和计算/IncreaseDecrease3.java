package 基本数据类型和计算;

public class IncreaseDecrease3 {
    public static void main(String[] args) {
        int a = 1;
        System.out.println("a++=" + a++);

        System.out.println("a++=" + a);
        a = a + 1;

        a = 1;

        System.out.println("++a=" + (++a));

        a = a + 1;
        System.out.println("++a=" + a);
    }
}
