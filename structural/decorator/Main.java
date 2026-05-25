package structural.decorator;

public class Main {

    public static void main(String[] args) {

        ApiHandler apiHandler =
                new AuthDecorator(
                        new UserApiHandler()
                );

        apiHandler.handleRequest();
    }
}