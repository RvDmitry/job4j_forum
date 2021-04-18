package ru.job4j.forum.service;

import org.springframework.stereotype.Service;
import ru.job4j.forum.model.Authority;
import ru.job4j.forum.store.AuthorityRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * Class AuthorityService
 * Сервис-класс по работе с ролями пользователей.
 * @author Dmitry Razumov
 * @version 1
 */
@Service
public class AuthorityService {
    /**
     * Ссылка на хранилище ролей.
     */
    private final AuthorityRepository authorities;

    /**
     * Конструктор инициализирует сервис-класс и ссылку на хранилище.
     * @param authorities Ссылка на хранилище.
     */
    public AuthorityService(AuthorityRepository authorities) {
        this.authorities = authorities;
    }

    /**
     * Метод возвращает список всех ролей из хранилища.
     * @return Список ролей.
     */
    public List<Authority> getAll() {
        List<Authority> rsl = new ArrayList<>();
        authorities.findAll().forEach(rsl::add);
        return rsl;
    }

    /**
     * Метод сохраняет или обновляет роль в хранилище.
     * @param authority Роль.
     */
    public void save(Authority authority) {
        authorities.save(authority);
    }

    /**
     * Метод ищет роль по ее наименованию.
     * @param authority Наименование роли.
     * @return Роль.
     */
    public Authority findByAuthority(String authority) {
        return authorities.findByAuthority(authority);
    }
}
