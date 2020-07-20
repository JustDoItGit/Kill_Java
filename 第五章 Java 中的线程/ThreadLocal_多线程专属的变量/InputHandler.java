package ThreadLocal_多线程专属的变量;

public class InputHandler {
    public String getInput() {
        return produceString();
    }

    private static String produceString() {
        PerformanceTracker.startPhase();
        StringBuilder ret = new StringBuilder();
        for (int i = 0; i < 128; i++) {
            int rand = ((int) (Math.random() * 1000)) % 26;
            char ch = (char) (rand + 'a');
            ret.append(ch);
        }
        PerformanceTracker.endPhase("InputGen");
        return ret.toString();
    }
}
