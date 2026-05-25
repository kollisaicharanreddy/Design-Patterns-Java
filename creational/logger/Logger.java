package creational.logger;

import java.time.LocalDateTime;

public class Logger {

    // single object creation
    private static Logger instance;

    // private constructor prevents object creation outside
    private Logger() {
        System.out.println("Logger initialized...");
    }

    // global access point
    public static Logger getInstance() {

        if (instance == null) {
            instance = new Logger();
        }

        return instance;
    }

    public void log(String message) {

        String logMessage =
                "[" + LocalDateTime.now() + "] " + message;

        System.out.println(logMessage);

        // imagine writing to file also here
    }
}