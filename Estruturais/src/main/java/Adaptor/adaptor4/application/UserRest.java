package Adaptor.adaptor4.application;

import Adaptor.adaptor4.core.model.User;
import Adaptor.adaptor4.core.ports.UserRepository;
import Adaptor.adaptor4.core.usercases.UserService;
import Adaptor.adaptor4.infra.UserMemoryDBAdapter;

import java.util.List;
import java.util.Map;

public class UserRest {

    private UserService service;

    public UserRest() {
        UserRepository repo = new UserMemoryDBAdapter();
        this.service = new UserService(repo);
    }

    public Integer post(Map<String, String> values) {
        try{
            User user = new User(values.get("name"), values.get("email"), values.get("password"));
            service.saveUser(user);
        }catch (Exception e) {
            System.err.println(e.getMessage());
            return 400;
        }
        return 201;
    }

    public Integer get() {
        List<User> list = service.getUsers();
        list.stream().forEach(x -> System.out.println(x));
        return 200;
    }
}