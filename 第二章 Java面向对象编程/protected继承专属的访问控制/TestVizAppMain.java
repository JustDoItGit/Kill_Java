package protected继承专属的访问控制;

import protected继承专属的访问控制.supermarket.LittleSuperMarket;
import protected继承专属的访问控制.supermarket.Phone;
import protected继承专属的访问控制.supermarket.ShellColorChangePhone;

public class TestVizAppMain {
    public static void main(String[] args) {
        LittleSuperMarket superMarket = new LittleSuperMarket("大卖场",
                "世纪大道1号", 500, 600, 100);

        // >> TODO 不同包里的代码，不可以访问缺省和protected
        Phone ph = (Phone) superMarket.getMerchandiseOf(10);
//        System.out.println(ph.screenSize);
//        System.out.println(ph.memoryG);

        ShellColorChangePhone scp = (ShellColorChangePhone) superMarket.getMerchandiseOf(100);
//        System.out.println(scp.screenSize);
//        System.out.println(scp.memoryG);

    }

}
