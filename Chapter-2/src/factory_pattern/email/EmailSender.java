package factory_pattern.email;

import factory_pattern.ApplicationService;

public class EmailSender implements ApplicationService {
    private String sender;
    private String email;
    private String password;
    private String userName;

    public void configure(String sender, String email, String password, String userName) {
        this.sender = sender;
        this.email = email;
        this.password = password;
        this.userName = userName;
    }

    public void sendEmail() {
        if(password != null && sender != null && email != null) {
            System.out.println("Sending email...");
        }else
            throw new RuntimeException("Email send error...!");
    }
}
