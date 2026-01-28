package domain;

import lombok.Data;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Data
public class Order {

    private Integer id;
    private String orderDescription;
    private Date orderDate;

    private OrderStatus orderStatus;

    private Set<Product> products = new HashSet<>();
    private Payment payment;


}
