package structural.adapter;

public class ExternalPaymentService {

    public void makePayment(double value) {

        System.out.println(
                "Payment processed using external service: ₹" + value
        );
    }
}