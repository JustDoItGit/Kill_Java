package 父类和子类的引用赋值关系;

import 父类和子类的引用赋值关系.supermarket.LittleSuperMarket;
import 父类和子类的引用赋值关系.supermarket.MerchandiseV2;

public class LittleSuperMarketAppMain {
    public static void main(String[] args) {
        LittleSuperMarket superMarket = new LittleSuperMarket("大卖场",
            "世纪大道1号", 500, 600, 100);

        MerchandiseV2 m0 = superMarket.getMerchandiseOf(0);
        m0.describe();
        System.out.println();
        MerchandiseV2 m100 = superMarket.getMerchandiseOf(100);
        m100.describe();
        System.out.println();
        MerchandiseV2 m10 = superMarket.getMerchandiseOf(10);
        m10.describe();


    }
}
