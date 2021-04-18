package ru.job4j.forum.store;

import org.springframework.data.repository.CrudRepository;
import ru.job4j.forum.model.Post;

/**
 * Interface PostRepository
 *
 * @author Dmitry Razumov
 * @version 1
 */
public interface PostRepository extends CrudRepository<Post, Integer> {
}
