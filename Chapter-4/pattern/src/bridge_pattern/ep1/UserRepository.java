package bridge_pattern;

import java.util.List;

class UserRepository implements Repository<User> {
    @Override
    public List<User> findAll() {
        return List.of();
    }

    @Override
    public User save(User o) {
        return null;
    }

    @Override
    public int delete(User o) {
        return 0;
    }
}
