package Java中的File类;

import java.io.File;

public class SeparatorAppMain {
    public static void main(String[] args) {
        System.out.println("文件路径分隔符\t" + File.separator);
        System.out.println("环境变量分隔符\t" + File.pathSeparator);
    }
}
