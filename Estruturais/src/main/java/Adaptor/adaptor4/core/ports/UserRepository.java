package Adaptor.adaptor4.core.ports;

import Adaptor.adaptor4.core.model.User;

import java.util.List;

public interface UserRepository {

    void save(User user);
    List<User> getAll();
}
