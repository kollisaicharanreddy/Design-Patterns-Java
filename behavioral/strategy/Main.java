package behavioral.strategy;

public class Main {

    public static void main(String[] args) {

        PaymentContext paymentContext =
                new PaymentContext();

        // UPI payment
        paymentContext.setPaymentStrategy(
                new UpiPayment()
        );

        paymentContext.makePayment(1500);

        // Credit card payment
        paymentContext.setPaymentStrategy(
                new CreditCardPayment()
        );

        paymentContext.makePayment(5000);
    }
}