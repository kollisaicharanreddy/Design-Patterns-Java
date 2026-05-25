package structural.decorator;

public abstract class ApiDecorator implements ApiHandler {

    protected ApiHandler apiHandler;

    public ApiDecorator(ApiHandler apiHandler) {

        this.apiHandler = apiHandler;
    }

    @Override
    public void handleRequest() {

        apiHandler.handleRequest();
    }
}