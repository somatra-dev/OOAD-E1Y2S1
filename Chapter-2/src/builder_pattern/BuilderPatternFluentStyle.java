package builder_pattern;

import lombok.Setter;
import lombok.ToString;

@Setter
@ToString
class User {
    private Integer id;

    private String name;

    private String email;

    private String phoneNumber;

    private String profile;

    private User(UserBuilder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.email = builder.email;
        this.phoneNumber = builder.phoneNumber;
        this.profile = builder.profile;
    }


    @Setter
    static class UserBuilder {

        private Integer id;

        private String name;

        private String email;

        private String phoneNumber;

        private String profile;

        public UserBuilder(){}

        public UserBuilder id(Integer id) {
            this.id = id;
            return this;
        }
        public UserBuilder name(String name) {
            this.name = name;
            return this;
        }
        public UserBuilder email(String email) {
            this.email = email;
            return this;
        }
        public UserBuilder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public UserBuilder profile(String profile) {
            this.profile = profile;
            return this;
        }

        public User build() {
            return new User(this);
        }

    }
}


public class BuilderPatternFluentStyle {
    public static void main(String[] args) {

        User user = new User.UserBuilder()
                .id(1)
                .name("Koko")
                .email("Koko@gmail.com")
                .phoneNumber("012345678")
//                .profile("google.com/photo.exe")
                .build();

        System.out.println(user);

    }
}
