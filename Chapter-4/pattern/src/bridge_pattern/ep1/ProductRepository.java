package bridge_pattern;

import java.util.List;

class ProductRepository implements Repository<Product> {
    @Override
    public List<Product> findAll() {
        return List.of();
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