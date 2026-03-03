package bridge_pattern;

import java.util.List;

class ProductService implements Service<Product> {
    // bridge
    private final Repository<Product> productRepository
            = new ProductRepository();

    @Override
    public List<Product> getAll() {
        return productRepository.findAll();
    }

    @Override
    public Product save(Product o) {
        return null;
    }

    @Override
    public int delete(Product o) {
        return 0;
    }
}