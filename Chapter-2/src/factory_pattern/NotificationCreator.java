package factory_pattern;

import java.sql.Date;
import java.time.Instant;

public class NotificationCreator extends ServiceCreator{

    @Override
    public ApplicationService getInstance() {
        NotificationService notification = new NotificationService();
        notification.setTimestamp(Date.from(Instant.now()));
        notification.setId("Notification created object");
        return notification;
    }
}
