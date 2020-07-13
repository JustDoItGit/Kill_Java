package 枚举.supermarket;

// >> TODO 使用enum而非class声明
public enum Category {
    // >> TODO 必须在开始的时候以这种形式，创建所有的枚举对象
    FOOD(1, 1),
    // >> TODO 不可以重名
//    FOOD(1),
    COOK(3, 3),
    SNACK(5, 5),
    CLOTHES(7, 7),
    ELECTRIC(9, 9);

    private int id;
    public int di;

    // >> TODO 构造方法必须是private的，不写也是private的
    Category(int id, int di) {
        this.id = id;
        this.di = di;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", di=" + di +
                '}';
    }
}
