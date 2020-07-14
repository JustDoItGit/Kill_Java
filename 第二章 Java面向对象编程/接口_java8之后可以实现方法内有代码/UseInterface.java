package 接口_java8之后可以实现方法内有代码;


import 接口_java8之后可以实现方法内有代码.supermarket.*;

import java.util.Date;

public class UseInterface {

    public static void main(String[] args) {

        Date produceDate = new Date();
        Date expireDate = new Date(produceDate.getTime() + 365L * 24 * 3600 * 1000);
        GamePointCard gamePointCard = new GamePointCard(
                "手机001", "Phone001", 100, 1999, 999,
                produceDate, expireDate
        );

        // >> TODO 父类的引用可以用子类的引用赋值，抽象类也一样
        ExpireDateMerchandise am = gamePointCard;

        System.out.println(am.notExpireInDays(362));

        System.out.println(am.leftDatePercentage());

        System.out.println(am.actualValueNow(am.leftDatePercentage()));

    }
}
