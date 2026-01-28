package domain;

import lombok.Data;

import java.util.Date;

@Data
public class Invoice {
    private Integer id;
    private Date issueDate;
    private String invoiceName;
    private Double cash;

}

