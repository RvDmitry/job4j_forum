package ru.job4j.forum.model;

import javax.persistence.*;
import java.util.Calendar;
import java.util.Objects;

/**
 * Class Post
 * Класс описывает тему.
 * @author Dmitry Razumov
 * @version 1
 */
@Entity
@Table(name = "posts")
public class Post {
    /**
     * Идентификатор темы.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    /**
     * Наименование темы.
     */
    private String name;
    /**
     * Описание темы.
     */
    private String description;
    /**
     * Дата создания темы.
     */
    private Calendar created;

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
     * Метод возвращает наименование.
     * @return Наименование.
     */
    public String getName() {
        return name;
    }

    /**
     * Метод задает наименование.
     * @param name Наименование.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Метод возвращает описание.
     * @return Описание.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Метод задает описание.
     * @param description Описание.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Метод возвращает дату.
     * @return Дата.
     */
    public Calendar getCreated() {
        return created;
    }

    /**
     * Метод задает дату.
     * @param created Дата.
     */
    public void setCreated(Calendar created) {
        this.created = created;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Post post = (Post) o;
        return id == post.id
                && Objects.equals(name, post.name)
                && Objects.equals(description, post.description)
                && Objects.equals(created, post.created);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, created);
    }
}
