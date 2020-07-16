package 代码篇_超市运转代码实现.supermarket;

import 代码篇_超市运转代码实现.supermarket.impl.SimpleShopman;
import 代码篇_超市运转代码实现.supermarket.interfaces.Customer;
import 代码篇_超市运转代码实现.supermarket.interfaces.Shopman;
import 代码篇_超市运转代码实现.supermarket.interfaces.SuperMarket;

import static 代码篇_超市运转代码实现.supermarket.util.ShoppingUtil.*;


public class ShoppingAppMain {
    public static void main(String[] args) {
        SuperMarket superMarket = createSuperMarket();

        Shopman shopman = new SimpleShopman(superMarket);

        boolean open = true;
        while (open) {
            new ShoppingTask(shopman).executeTask();
            output("是否继续营业？(Yes)");
            open = !input().next().trim().equalsIgnoreCase("no");
        }

        superMarket.dailyReport();
    }
}

class ShoppingTask {
    private Shopman shopman;

    public ShoppingTask(Shopman shopman) {
        this.shopman = shopman;
    }

    public void executeTask() {
        Customer customer = createCustomer(true);

        shopman.serveCustomer(customer);
    }
}