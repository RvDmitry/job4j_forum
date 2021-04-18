package ru.job4j.forum.model;

import javax.persistence.*;
import java.util.Objects;

/**
 * Class User
 * Класс описывает пользователя.
 * @author Dmitry Razumov
 * @version 1
 */
@Entity
@Table(name = "users")
public class User {
    /**
     * Идентификатор.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    /**
     * Имя.
     */
    private String name;
    /**
     * Пароль.
     */
    private String password;
    /**
     * Email.
     */
    private String email;

    /**
     * Фабрика создает пользователя.
     * @param name Имя.
     * @param password Пароль.
     * @param email Email.
     * @return Пользователь.
     */
    public static User of(String name, String password, String email) {
        User user = new User();
        user.name = name;
        user.password = password;
        user.email = email;
        return user;
    }

    /**
     * Метод возвращает идентификатор.
     * @return Идентификатор.
     */
    public int getId() {
        return id;
    }

    /**
     * Метод задает идентификатор.
     * @param id Идентификатор.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Метод возвращает имя.
     * @return Имя.
     */
    public String getName() {
        return name;
    }

    /**
     * Метод задает имя.
     * @param name Имя.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Метод возвращает пароль.
     * @return Пароль.
     */
    public String getPassword() {
        return password;
    }

    /**
     * Метод задает пароль.
     * @param password Пароль.
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Метод возвращает email.
     * @return Email.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Метод задает email.
     * @param email Email.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return id == user.id
                && Objects.equals(name, user.name)
                && Objects.equals(password, user.password)
                && Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, password, email);
    }
}
