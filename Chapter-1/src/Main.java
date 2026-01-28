import com.sun.security.jgss.GSSUtil;
import domain.*;
import repository.UserRepository;
import service.OrderService;
import service.impl.OrderServiceImpl;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setUsername("piseth");
        customer.setId(1);
        // Order
        Order order = new Order();
        order.setId(1);
        order.setOrderStatus(OrderStatus.PENDING);
        //
        Product product1 = new Product();
        product1.setProductName("Coca");
        product1.setPrice(1.5);
        Product product2 =new Product();
        product2.setProductName("មីហិល");
        product2.setPrice(3.0);
        // add product to order | cart
        order.getProducts().add(product1);
        order.getProducts().add(product2);
        //
        OrderService orderService = new OrderServiceImpl();
        orderService.createOrder(customer,order);
        System.out.println(UserRepository.users);

    }
}