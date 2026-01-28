package factory_pattern;

public class App1 {
    public static void main(String[] args) {

        ServiceCreator serviceCreator = new NotificationCreator();
        NotificationService applicationService = (NotificationService) serviceCreator.getInstance();
        System.out.println(applicationService.getId());
    }
}
