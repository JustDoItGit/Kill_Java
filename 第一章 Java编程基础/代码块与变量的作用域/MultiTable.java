package 代码块与变量的作用域;

public class MultiTable {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            String line = "";
            for (int j = 1; j <= 9; j++) {
                if (i >= j){
                    line += i + "*" + i + "=" + (i * j) + "\t";
                }
                else{
                    break;
                }
            }
            System.out.println(line);
        }
    }
}
