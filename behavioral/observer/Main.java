package behavioral.observer;

public class Main {

    public static void main(String[] args) {

        YouTubeChannel channel =
                new YouTubeChannel();

        Subscriber user1 =
                new EmailSubscriber("Charan");

        Subscriber user2 =
                new EmailSubscriber("Rahul");

        channel.subscribe(user1);
        channel.subscribe(user2);

        channel.uploadVideo(
                "Design Patterns in Java"
        );
    }
}