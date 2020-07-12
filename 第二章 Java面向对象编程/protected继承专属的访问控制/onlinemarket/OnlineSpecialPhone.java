package protected继承专属的访问控制.onlinemarket;

import protected继承专属的访问控制.supermarket.Phone;

public class OnlineSpecialPhone extends Phone {

    public OnlineSpecialPhone(String name, String id, int count, double soldPrice, double purchasePrice, double screenSize, double cpuHZ, int memoryG, int storageG, String brand, String os) {
        super(name, id, count, soldPrice, purchasePrice, screenSize, cpuHZ, memoryG, storageG, brand, os);
        this.screenSize = 99;
//        this.memoryG = 1; // error 别的包的子类不可以访问缺省成员
    }

    // >> TODO 子类覆盖父类的方法，不可以用可见性更低的修饰符，但是可以用更高的修饰符
    // >> TODO 原因是什么呢？
    public String getNameOfPhone() {
        return super.getNameOfPhone();
    }
}
