package ru.job4j.forum.service;

import org.springframework.stereotype.Service;
import ru.job4j.forum.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Class UserService
 *
 * @author Dmitry Razumov
 * @version 1
 */
@Service
public class UserService {

    private final AtomicInteger userId = new AtomicInteger();

    private final List<User> users = new ArrayList<>();

    public List<User> getAll() {
        return users;
    }

    public void save(User user) {
        if (user.getId() == 0) {
            user.setId(userId.incrementAndGet());
            users.add(user);
        } else {
            User u = findById(user.getId());
            u.setName(user.getName());
            u.setPassword(user.getPassword());
            u.setEmail(user.getEmail());
        }
    }

    public User findById(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }
}
