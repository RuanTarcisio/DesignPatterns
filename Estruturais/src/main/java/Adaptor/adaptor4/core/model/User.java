package Adaptor.adaptor4.core.model;

public class User {private String name;
    private String email;
    private String password;

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPassword() {
        return this.password;
    }

    public String toString() {
        return "User [name=" + this.name + ", email=" + this.email + ", password=" + this.password + "]";
    }
}