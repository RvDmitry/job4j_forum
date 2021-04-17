package ru.job4j.forum.model;

import java.util.Calendar;
import java.util.Objects;

/**
 * Class Post
 * Класс описывает тему.
 * @author Dmitry Razumov
 * @version 1
 */
public class Post {
    /**
     * Идентификатор темы.
     */
    private int id;
    /**
     * Наименование темы.
     */
    private String name;
    /**
     * Описание темы.
     */
    private String desc;
    /**
     * Дата создания темы.
     */
    private Calendar created;

    /**
     * Фабрика создает тему.
     * @param name Наименование.
     * @return Тема.
     */
    public static Post of(String name) {
        Post post = new Post();
        post.name = name;
        post.created = Calendar.getInstance();
        return post;
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
    public String getDesc() {
        return desc;
    }

    /**
     * Метод задает описание.
     * @param desc Описание.
     */
    public void setDesc(String desc) {
        this.desc = desc;
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
                && Objects.equals(desc, post.desc)
                && Objects.equals(created, post.created);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, desc, created);
    }
}
