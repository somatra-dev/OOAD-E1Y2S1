package bridge_pattern;

import java.util.List;

class UserService implements Service<User> {
    private final Repository<User> userRepository
            = new UserRepository();

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
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
