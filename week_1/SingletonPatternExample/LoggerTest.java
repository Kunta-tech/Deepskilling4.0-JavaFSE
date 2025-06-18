package SingletonPatternExample;

public class LoggerTest {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        if (logger1 == logger2) {
            System.out.println("PASS: Both logger instances are the same.");
        } else {
            System.out.println("FAIL: Logger instances are different.");
        }

        System.out.println("Logger1 id: "+logger1.hashCode());
        System.out.println("Logger2 id: "+logger2.hashCode());
    }
}
