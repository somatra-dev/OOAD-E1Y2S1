package factory_pattern.email;

import factory_pattern.ApplicationService;
import factory_pattern.ServiceCreator;

public class EmailSenderCreator extends ServiceCreator {

    @Override
    public ApplicationService getInstance() {
        EmailSender emailSender = new EmailSender();
        emailSender.configure(
                "koko@gmail.com",
                "soma@gmail.com",
                "123456",
                "Koko"
        );

        return emailSender;
    }
}
