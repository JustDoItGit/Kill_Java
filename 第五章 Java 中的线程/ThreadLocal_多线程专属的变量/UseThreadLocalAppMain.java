package ThreadLocal_多线程专属的变量;

public class UseThreadLocalAppMain {
    // TODO ThreadLocal一般用在跨类，跨方法的传递一些值。
    // TODO 在一些框架、底层的类中可能会用到，可以避免上层引用代码为了框架当数据的二传手
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            Thread workingThread = new Thread(() -> {
                System.out.println("开始处理……");
                PerformanceTracker.reset();

                InputHandler inputHandler = new InputHandler();
                String content = inputHandler.getInput();

                DBQuery query = new DBQuery();
                query.query();

                ContentProcess contentProcess = new ContentProcess();
                contentProcess.process(content);

                PerformanceTracker.finish();
                System.out.println("处理结束");

            }, "Worker-" + i);

            workingThread.start();
        }


    }
}
