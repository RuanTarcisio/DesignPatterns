package Adaptor.adaptor4.core.usercases;


import Adaptor.adaptor4.core.model.User;
import Adaptor.adaptor4.core.ports.UserRepository;

import java.util.List;

public class UserService {

    private UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public void saveUser(User user){

    }

    public List<User> getUsers(){
        return repository.getAll();
    }
}
