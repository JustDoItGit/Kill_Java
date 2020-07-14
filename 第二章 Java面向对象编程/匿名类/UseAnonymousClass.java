package 匿名类;


import 匿名类.supermarket.Phone;
import 匿名类.supermarket.UnitSpec;

public class UseAnonymousClass {
    public static void main(String[] args) {
        Phone phone = new Phone(
                "手机001", "Phone001", 100, 1999, 999,
                4.5, 3.8, 4, 128, "索尼", "安卓"
        );

        printSpec(phone.getCpu());

        // >> TODO 匿名类的实例作为参数传递也没问题
        printSpec(new UnitSpec() {
            @Override
            public double getNumSpec() {
                return 126;
            }

            @Override
            public String getProducer() {
                return "new as an argument";
            }
        });
    }

    private static void printSpec(UnitSpec spec) {
        System.out.println("Spec producer=" + spec.getProducer() + ". Num=" + spec.getNumSpec());
    }
}
