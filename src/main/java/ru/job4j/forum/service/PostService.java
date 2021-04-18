package ru.job4j.forum.service;

import org.springframework.stereotype.Service;
import ru.job4j.forum.model.Post;
import ru.job4j.forum.store.PostRepository;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Class PostService
 * Сервис-класс по работе с постами.
 * @author Dmitry Razumov
 * @version 1
 */
@Service
public class PostService {
    /**
     *  Ссылка на хранилище постов.
     */
    private final PostRepository posts;

    /**
     * Конструктор инициализирует сервис-класс и ссылку на хранилище.
     * @param posts Ссылка на хранилище.
     */
    public PostService(PostRepository posts) {
        this.posts = posts;
    }

    /**
     * Метод возвращает список всех постов из хранилища.
     * @return Список постов.
     */
    public List<Post> getAll() {
        List<Post> rsl = new ArrayList<>();
        posts.findAll().forEach(rsl::add);
        rsl.sort(Comparator.comparing(Post::getId));
        return rsl;
    }

    /**
     * Метод сохраняет или обновляет пост в хранилище.
     * @param post Пост.
     */
    public void create(Post post) {
        posts.save(post);
    }

    /**
     * Метод ищет пост в хранилище по его идентификатору.
     * @param id Идентификатор.
     * @return Пост.
     */
    public Post findById(int id) {
        return posts.findById(id).orElse(null);
    }
}
