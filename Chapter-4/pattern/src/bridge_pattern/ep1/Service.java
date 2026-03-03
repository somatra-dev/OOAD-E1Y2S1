package bridge_pattern;

import java.util.List;

// abstraction
interface Service<T> {
    List<T> getAll();

    T save(T o);

    int delete(T o);
}
