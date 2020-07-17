package 异常传递不是凌波微步;

import 异常传递不是凌波微步.myexceptions.MyException;

public class Caller2 {
    Caller3 caller3 = new Caller3();

    public void call3RTException() {
        System.out.println("Caller2.call3RTException开始");
        caller3.callThrowRTException();
        System.out.println("Caller2.Caller2call3RTException结束");

    }

    public void call3Exception() throws ClassNotFoundException, MyException {
        System.out.println("Caller2.call3Exception开始");
        caller3.callThrowException();
        System.out.println("Caller2.call3Exception结束");
    }
}
