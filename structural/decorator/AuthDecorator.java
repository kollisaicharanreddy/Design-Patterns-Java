package structural.decorator;

public class AuthDecorator extends ApiDecorator {

    public AuthDecorator(ApiHandler apiHandler) {

        super(apiHandler);
    }

    @Override
    public void handleRequest() {

        if (isAuthenticated()) {

            System.out.println("Authentication successful");

            apiHandler.handleRequest();

        } else {

            System.out.println("Authentication failed");
        }
    }

    private boolean isAuthenticated() {

        // mock authentication logic
        return true;
    }
}