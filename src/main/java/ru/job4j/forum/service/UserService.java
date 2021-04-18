package ru.job4j.forum.service;

import org.springframework.stereotype.Service;
import ru.job4j.forum.model.User;
import ru.job4j.forum.store.UserRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * Class UserService
 * Сервис-класс по работе с пользователями.
 * @author Dmitry Razumov
 * @version 1
 */
@Service
public class UserService {
    /**
     * Ссылка на хранилище пользователей.
     */
    private final UserRepository users;

    /**
     * Конструктор инициализирует сервис-класс и ссылку на хранилище.
     * @param users Ссылка на хранилище.
     */
    public UserService(UserRepository users) {
        this.users = users;
    }

    /**
     * Метод возвращает список всех пользователей из хранилища.
     * @return Список пользователей.
     */
    public List<User> getAll() {
        List<User> rsl = new ArrayList<>();
        users.findAll().forEach(rsl::add);
        return rsl;
    }

    /**
     * Метод сохраняет или обновляет пользователя в хранилище.
     * @param user Пользователь.
     */
    public void save(User user) {
        users.save(user);
    }

    /**
     * Метод ищет пользователя в хранилище по его идентификатору.
     * @param id Идентификатор.
     * @return Пользователь.
     */
    public User findById(int id) {
        return users.findById(id).orElse(null);
    }
}
