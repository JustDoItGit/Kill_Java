package 数组;

public class AssignArray {
    public static void main(String[] args) {
        int[] array = new int[3];

        array[0] = 9;
        System.out.println("array的长度为" + array.length + "。array[0] = " + array[0]);

        array = new int[32];
//        array[0] = 100;
        System.out.println("array的长度为" + array.length + "。array[0] = " + array[0]);

        String[] strArray = new String[9];
        System.out.println(strArray[0]);
    }
}
