package domain;

import lombok.Data;

import java.util.Date;

@Data
public class Product {
    private Integer id;
    private String productName;
    private Double price;
    private Date expirationDate;
}
