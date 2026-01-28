package service.impl;

import domain.*;
import repository.OrderRepository;
import repository.UserRepository;
import service.OrderService;

import java.time.Instant;
import java.util.Date;
import java.util.Random;


public class OrderServiceImpl implements OrderService {
    @Override
    public Order createOrder(Customer customer, Order order) {
        customer.getOrders().add(order);

        // get invoice
        Invoice invoice = new Invoice();
        // get total price
        Double total = 0.0;
        for(Product product : order.getProducts()){
            total += product.getPrice();
        }

        invoice.setCash(total);
        invoice.setId(new Random().nextInt(9999999));
        invoice.setIssueDate(Date.from(Instant.now()));

        // payment
        Payment payment = new Payment();
        payment.setId(new Random().nextInt(9999999));
        payment.setHash(String.valueOf(invoice.getId().hashCode()));
        payment.setPaidDate(Date.from(Instant.now()));
        payment.setInvoice(invoice);

        order.setPayment(payment);
        UserRepository.users.add(customer);
        return order;
    }

    @Override
    public void cancelOrder(Integer id, OrderStatus orderStatus) {
        Order order = OrderRepository.orders.stream()
                .filter(o -> o.getId().equals(id))
                .findAny().get();
        OrderRepository.orders.removeIf(o -> o.getId().equals(id));
        order.setOrderStatus(OrderStatus.CANCELED);
        OrderRepository.orders.add(order);
    }
}
