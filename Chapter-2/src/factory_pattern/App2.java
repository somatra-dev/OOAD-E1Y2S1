package factory_pattern;

import factory_pattern.email.EmailSender;
import factory_pattern.email.EmailSenderCreator;

public class App2 {
    public static void main(String[] args) {

        ServiceCreator serviceCreator = new EmailSenderCreator();
        EmailSender applicationService = (EmailSender) serviceCreator.getInstance();
        applicationService.sendEmail();
    }
}
