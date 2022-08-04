package web.repository;

import web.models.User;

import java.util.List;

public interface UserDAO {
    List<User> getAllUser();
    User getUserById(long id);
    void saveUser(User user);
    void deleteUser(long id);
    void updateUser(User user);


}
