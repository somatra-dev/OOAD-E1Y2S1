package domain;

import lombok.Data;

import java.util.Date;

@Data
public class Payment {

    private Integer id;
    private String paymentDescription;
    private String hash;
    private Date paidDate;

    private Invoice invoice;
}
