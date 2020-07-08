package 方法和属性的可见性修饰符;

import 方法和属性的可见性修饰符.supermarket.MerchandiseV2;
//import 方法和属性的可见性修饰符.supermarket.NonPublicClassCanUseAnyName;

public class MerchandiseV2DescAppMain {
    public static void main(String[] args) {
        // >> TODO 非共有的类，不能在包外被使用
//         NonPublicClassCanUseAnyName asd;
//        MerchandiseV2 merchandise = new MerchandiseV2
//            ("书桌", "DESK9527", 40, 999.9, 500);
        MerchandiseV2 merchandise = MerchandiseV2.createMerchandise("书桌", "DESK9527", 40, 999.9, 500);

        merchandise.describe();
    }
}
