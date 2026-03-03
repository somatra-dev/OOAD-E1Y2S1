package bridge_pattern.ep1;


public class Bridge {
    public static void main(String[] args) {
        UserService userService
                = new UserService();
        userService.getAll();
        Service<Product> productService
                = new ProductService();
        productService.getAll();
    }
}


