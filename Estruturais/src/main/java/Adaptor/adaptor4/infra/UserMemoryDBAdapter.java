package Adaptor.adaptor4.infra;

import Adaptor.adaptor4.core.model.User;
import Adaptor.adaptor4.core.ports.UserRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserMemoryDBAdapter implements UserRepository {
    private Map<String, User> memoryUsers = new HashMap<>();

    @Override
    public void save(User user) {
        memoryUsers.put(user.getEmail(), user);
    }

    @Override
    public List<User> getAll() {
        return new ArrayList<User>(memoryUsers.values());
    }
}
