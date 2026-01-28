package creational_pattern;

import lombok.Getter;

import java.util.UUID;

// create singleton pattern
@Getter
class User {
    private static User instance;
    private final String uuid;
    private User(String uuid) {
        this.uuid = uuid;
    }
    public static User getInstance() {
        if (instance == null) {
            instance = new User(UUID.randomUUID().toString());
        }
        return instance;
    }

}

public class SingletonDemo {
    public static void main(String[] args) {

        User user = User.getInstance();
        User user2 = User.getInstance();
        System.out.println(user == user2);
    }
}
