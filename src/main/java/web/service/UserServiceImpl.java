package web.service;

import web.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import web.repository.UserDAO;
import org.springframework.stereotype.Service;

//import javax.annotation.PostConstruct;
import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDAO userDAO;

    @Override
    public List<User> getAllUser() {
        return userDAO.getAllUser();
    }

    @Override
    public User getUserById(long id) {
        return userDAO.getUserById(id);
    }

    @Override
    @Transactional
    public void saveUser(User user) {
        userDAO.saveUser(user);
    }

    @Override
    @Transactional
    public void deleteUser(long id) {
    userDAO.deleteUser(id);
    }

    @Override
    @Transactional
    public void updateUser(User user) {
    userDAO.updateUser(user);
    }

//    @PostConstruct
//    public void addFirstUserInTable() {
//        if (userDAO.getAllUser().isEmpty()){
//        User user1 = new User("Artem", "sdasd@dsafsd.ru","admin");
//        User user2 = new User("Alex", "sdsdsdd@dsafjh.by","user");
//        userDAO.saveUser(user1);
//        userDAO.saveUser(user2);}}
}
