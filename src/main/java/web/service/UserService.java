package web.service;

import web.models.User;

import java.util.List;

public interface UserService {
    List<User> getAllUser();
    User getUserById(long id);
    void saveUser(User user);
    void deleteUser(long id);
    void updateUser(User user);
}
