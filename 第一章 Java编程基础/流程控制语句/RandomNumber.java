package 流程控制语句;

public class RandomNumber {
    public static void main(String[] args) {
        double randNum = 0;

        while (randNum < 0.5) {
            randNum = Math.random();
            System.out.println(randNum);
        }

        int rangeStart = 99;
        int rangeEnd = 180;

        for (int i = 0; i < 100; i++) {
            int mod = rangeEnd - rangeStart;

            randNum = Math.random();
            int num = ((int) (randNum * rangeEnd * 100)) % mod;

            num += rangeStart;

            if (num <= rangeStart) {
                num = rangeStart + 1;
            }

            if (num >= rangeEnd) {
                num = rangeEnd - 1;
            }
            System.out.println("这次的随机数是：" + num);
        }
    }
}
