package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.model.User;
import web.repositories.UserRepossitory;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class UserService {
    private final UserRepossitory userRepossitory;

    @Autowired
    public UserService(UserRepossitory userRepossitory) {
        this.userRepossitory = userRepossitory;
    }
    public List<User> findAll() {
        return userRepossitory.findAll();
    }

    public User findOne(int id) {
        Optional<User> foundUser = userRepossitory.findById(id);
        return foundUser.orElse(null);
    }

    @Transactional
    public void save(User user) {
        userRepossitory.save(user);
    }

    @Transactional
    public void update(int id, User updatedUser) {
        updatedUser.setId(id);
        userRepossitory.save(updatedUser);
    }

    @Transactional
    public void delete(int id) {
        userRepossitory.deleteById(id);
    }
}
