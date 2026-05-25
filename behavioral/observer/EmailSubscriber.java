package behavioral.observer;

public class EmailSubscriber implements Subscriber {

    private String subscriberName;

    public EmailSubscriber(String subscriberName) {

        this.subscriberName = subscriberName;
    }

    @Override
    public void update(String videoTitle) {

        System.out.println(
                subscriberName +
                " received notification: New video uploaded -> "
                + videoTitle
        );
    }
}