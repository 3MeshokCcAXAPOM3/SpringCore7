package web.repository;

import web.models.User;
import org.springframework.stereotype.Repository;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
@Repository
public class UserDAOImpl implements UserDAO {
    @PersistenceContext
    private EntityManager em;

    @Override
    public List<User> getAllUser() {
        return em.createQuery("FROM User", User.class).getResultList();
    }

    @Override
    public User getUserById(long id) {
        return em.find(User.class, id);
    }

    @Override
    public void saveUser(User user) {
        em.persist(user);

    }

    @Override
    public void deleteUser(long id) {
        User user = getUserById(id);
        if(user != null){
            em.remove(user);
        }
    }

    @Override
    public void updateUser(User user) {
    em.merge(user);
    }
}
