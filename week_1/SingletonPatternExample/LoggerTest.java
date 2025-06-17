package SingletonPatternExample;

public class LoggerTest {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Check if both references point to the same object
        if (logger1 == logger2) {
            System.out.println("PASS: Both logger instances are the same.");
        } else {
            System.out.println("FAIL: Logger instances are different.");
        }

        // Optional: Print hash codes to show they are same object
        System.out.println("Logger1 hashCode: " + logger1.hashCode());
        System.out.println("Logger2 hashCode: " + logger2.hashCode());
    }
}
