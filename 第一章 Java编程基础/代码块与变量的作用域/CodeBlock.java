package 代码块与变量的作用域;

public class CodeBlock {
    public static void main(String[] args) {
        int outer = 100;

        {
//            int outer = 199; // error
            outer = 199;
            System.out.println(outer);
        }
        System.out.println(outer);

        {
            int inner = 10;
            System.out.println("outer变量的值是" + outer + "。inner变量的值是" + inner + "。");
        }
//        inner = 23; // error

        int a1 = 1;
        {
            int a2 = a1 + 1;
            {
                int a3 = a2 + 1;
                System.out.println("a3 = " + a3);
            }
            {
                int a3 = a2 + 10;
                System.out.println("a3 = " + a3);

            }
            System.out.println(a2);
        }
    }
}
