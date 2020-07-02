package 基本数据类型和计算;

public class ForceConvert {
    public static void main(String[] args) {
        int intVal = 99;
        long longVal = 19999;
        intVal = (int) longVal;

        float floatVal = 11.32f;
        double doubleVal = 33333.898;
        floatVal = (float) doubleVal;

        int a = 65;
        char b = (char) a;
//        char c = a; // error
//        b = a; // error
        System.out.println(b);



    }
}
