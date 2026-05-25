package structural.adapter;

public class PaymentAdapter implements PaymentProcessor {

    private ExternalPaymentService externalService;

    public PaymentAdapter() {

        this.externalService = new ExternalPaymentService();
    }

    @Override
    public void pay(double amount) {

        System.out.println("Connecting to external payment provider...");

        externalService.makePayment(amount);
    }
}