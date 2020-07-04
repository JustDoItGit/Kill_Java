package 数组;

public class ScoreArrayMaxScore {
    public static void main(String[] args) {
        /*
        int YuWenIndex = 0;
        int ShuXueIndex = 1;
        int WaiYuIndex = 2;
        int WuLiIndex = 3;
        int HuaXueIndex = 4;
        int ShengWuIndex = 5;
        */
        int totalScoreCount = 6;
        double[] scores = new double[totalScoreCount];
        /*
        String[] scoreNames = new String[totalScoreCount];

        scoreNames[YuWenIndex] = "语文";
        scoreNames[ShuXueIndex] = "数学";
        scoreNames[WaiYuIndex] = "外语";
        scoreNames[WuLiIndex] = "物理";
        scoreNames[HuaXueIndex] = "化学";
        scoreNames[ShengWuIndex] = "生物";
        */

        String[] scoreNames = {"语文", "数学", "外语", "物理", "化学", "生物"};
        for (int i = 0; i < 6; i++) {
            scores[i] = 80 + Math.random() * 20;
        }

        double maxScore = -1;
        int maxScoreIndex = -1;
        for (int i = 0; i < 6; i++) {
            System.out.println(scoreNames[i] + "的成绩为" + scores[i]);
            if (maxScore < scores[i]) {
                maxScore = scores[i];
                maxScoreIndex = i;
            }
        }
        System.out.println("最高分的科目为" + scoreNames[maxScoreIndex] + "最高成绩为" + maxScore);

    }
}
