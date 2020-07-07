package 静态方法;

import 静态方法.supermarket.LittleSuperMarket;
import 静态方法.supermarket.MerchandiseV2;

public class RunLittleSupperMarketAppMain {
    public static void main(String[] args) {
        // 创建一个小超市类
        LittleSuperMarket littleSuperMarket = new LittleSuperMarket(
            "有家小超市", "浦东新区世纪大道666号",
            100, 200, 200);

        System.out.println("VIP的折上折折扣最终为：" + MerchandiseV2.getDiscountOnDiscount(littleSuperMarket));

    }
}
