package 流程控制语句;

public class IfElseBaozi {
    public static void main(String[] args) {
        int baozi = 3;

        boolean baoziGangChuLong = true;

        if (baoziGangChuLong) {
            baozi += 2;
            System.out.println("包子刚出炉,买了" + baozi + "个肉包子");
        } else {
            System.out.println("买了" + baozi + "个肉包子");
        }
    }
}
