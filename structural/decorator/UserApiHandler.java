package structural.decorator;

public class UserApiHandler implements ApiHandler {

    @Override
    public void handleRequest() {

        System.out.println("Fetching user profile data...");
    }
}