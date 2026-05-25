package creational.builder;

public class Main {

    public static void main(String[] args) {

        User user = new User.UserBuilder(
                "Charan",
                "charan@gmail.com"
        )
                .age(22)
                .phone("9876543210")
                .address("Nagpur")
                .build();

        user.displayUser();
    }
}