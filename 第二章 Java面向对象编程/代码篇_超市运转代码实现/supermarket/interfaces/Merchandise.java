package 代码篇_超市运转代码实现.supermarket.interfaces;

public interface Merchandise {

    String getName();

    double getSoldPrice();

    double getPurchasePrice();

    int buy(int count);

    void putBack(int count);

    Category getCategory();

    int getCount();
}
