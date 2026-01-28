package factory_pattern;

import lombok.Data;

import java.util.Date;

@Data
public class NotificationService implements ApplicationService {
    private String to;
    private String message;
    private String id;
    private Date timestamp;

}
