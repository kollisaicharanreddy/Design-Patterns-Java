package creational.builder;

public class User {

    // required
    private final String name;
    private final String email;

    // optional
    private final int age;
    private final String phone;
    private final String address;

    // private constructor
    private User(UserBuilder builder) {

        this.name = builder.name;
        this.email = builder.email;
        this.age = builder.age;
        this.phone = builder.phone;
        this.address = builder.address;
    }

    public void displayUser() {

        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Age: " + age);
        System.out.println("Phone: " + phone);
        System.out.println("Address: " + address);
    }

    // Builder class
    public static class UserBuilder {

        // required
        private final String name;
        private final String email;

        // optional
        private int age;
        private String phone;
        private String address;

        public UserBuilder(String name, String email) {

            this.name = name;
            this.email = email;
        }

        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}