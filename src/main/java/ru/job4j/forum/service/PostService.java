package ru.job4j.forum.service;

import org.springframework.stereotype.Service;
import ru.job4j.forum.model.Post;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Class PostService
 *
 * @author Dmitry Razumov
 * @version 1
 */
@Service
public class PostService {

    private final AtomicInteger postId = new AtomicInteger();

    private final List<Post> posts = new ArrayList<>();

    public List<Post> getAll() {
        return posts;
    }

    public void create(Post post) {
        if (post.getId() == 0) {
            post.setId(postId.incrementAndGet());
            posts.add(post);
        } else {
            Post p = findById(post.getId());
            p.setName(post.getName());
            p.setDesc(post.getDesc());
        }
    }

    public Post findById(int id) {
        for (Post post : posts) {
            if (post.getId() == id) {
                return post;
            }
        }
        return null;
    }
}
