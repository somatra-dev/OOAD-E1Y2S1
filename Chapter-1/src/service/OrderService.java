package service;

import domain.Customer;
import domain.Order;
import domain.OrderStatus;

public interface OrderService {

    Order createOrder(Customer customer, Order order);

    void cancelOrder(Integer id, OrderStatus orderStatus);
}
