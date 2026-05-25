package creational.logger;
public class Main{
    public static void main(String[] args) {

        Logger logger1 = Logger.getInstance();

        logger1.log("Application started");

        Logger logger2 = Logger.getInstance();

        logger2.log("User logged in");

        System.out.println(logger1 == logger2);
    }
}