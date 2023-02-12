package service.utils;

public class ThreadingUtils {
    public static void sleep(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            throw new RuntimeException("Unexpected interrupt.", e);
        }
    }
}