package IO读文件;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class ReadStringFromFileAppMain {
    private static final String SOURCE_FILE_NAME = "测试文件.txt";

    public static void main(String[] args) {
        File sourceFile = new File("第四章 Java 中的常用工具类和新语法/IO读文件/" + File.separator + SOURCE_FILE_NAME);
        System.out.println(sourceFile);
        // TODO 猜猜 System.in是个啥，其实和output那边的套路是一样的，System.in只能读取标准的输入里的byte
        // TODO 而Scanner可以将这个byte读取出来，转换成String，进而转换成不同的数据类型，比如int，boolean
//        Scanner in = new Scanner(System.in);

        classicWay(sourceFile);

        coolerWay(sourceFile);
    }

    private static void classicWay(File sourceFile) {
        System.out.println("---------经典的处理方式-------------");
        try (
                // TODO 建立从文件到程序的数据输入（input）流
                FileInputStream fis = new FileInputStream(sourceFile);
                // TODO 用 InputStreamReader 将这个byte 流套一下，装饰一下，并指定字符编码，让它能够将读出的byte转为字符
                InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
                // TODO 增加缓存功能，输入输出效率更高，并且可以一次读取一行
                BufferedReader reader = new BufferedReader(isr)

        ) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                System.out.println(line.trim().toUpperCase());
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static void coolerWay(File sourceFile) {
        System.out.println("---------666的处理方式-------------");

        try (
                FileInputStream fis = new FileInputStream(sourceFile);
                InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
                BufferedReader reader = new BufferedReader(isr);
                ) {
            reader.lines().map(String::trim).map(String::toUpperCase).forEach(System.out::println);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
