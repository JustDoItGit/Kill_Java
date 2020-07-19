package 注解_元数据的搬运工;
public class TestUseAnnotation{
//    @PrimaryProperty(defaultValue = "testbggg", targetClass = TestUseAnnotation.class,
//        abc = 9, defaultValues = {"aaa", "bbb"})
    private Object abc;

    @Deprecated
    // TODO 给annotation里的属性赋值的方式
    @PrimaryProperty(defaultValue = "testbggg", targetClass = TestUseAnnotation.class,
        abc = 9, defaultValues = {"aaa", "bbb"}, is = @Override)
    public void test() {

    }


}
