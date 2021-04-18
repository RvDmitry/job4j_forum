package ru.job4j.forum.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.job4j.forum.model.Post;
import ru.job4j.forum.service.PostService;

import java.util.Calendar;

/**
 * Class PostControl
 *
 * @author Dmitry Razumov
 * @version 1
 */
@Controller
public class PostControl {

    private final PostService posts;

    public PostControl(PostService posts) {
        this.posts = posts;
    }

    @PostMapping("/post/create")
    public String create(@ModelAttribute Post post) {
        if (post.getCreated() == null) {
            post.setCreated(Calendar.getInstance());
        }
        posts.create(post);
        return "redirect:/index";
    }

    @GetMapping("/edit")
    public String edit(@RequestParam("id") int id, Model model) {
        Post post = posts.findById(id);
        if (post == null) {
            post = new Post();
        }
        model.addAttribute("post", post);
        return "edit";
    }

    @GetMapping("/post")
    public String post(@RequestParam("id") int id, Model model) {
        Post post = posts.findById(id);
        model.addAttribute("post", post);
        return "post";
    }
}
