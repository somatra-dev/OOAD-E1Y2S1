package bridge_pattern;

import java.util.List;

// implementation
interface Repository<T> {
    List<T> findAll();

    T save(T o);

    int delete(T o);
}