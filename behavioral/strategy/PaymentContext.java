package behavioral.strategy;

public class PaymentContext {

    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(
            PaymentStrategy paymentStrategy
    ) {
        this.paymentStrategy = paymentStrategy;
    }

    public void makePayment(double amount) {

        if (paymentStrategy == null) {

            System.out.println("Select payment method first");
            return;
        }

        paymentStrategy.pay(amount);
    }
}