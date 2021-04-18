package ru.job4j.forum.store;

import org.springframework.data.repository.CrudRepository;
import ru.job4j.forum.model.User;

/**
 * Interface UserRepository
 *
 * @author Dmitry Razumov
 * @version 1
 */
public interface UserRepository extends CrudRepository<User, Integer> {
}
