package com.gfa.thereddit.controllers;

import com.gfa.thereddit.models.Post;
import com.gfa.thereddit.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class PostController {

    private PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @RequestMapping(value="/", method= RequestMethod.GET)
    public String list(Model model) {
        List<Post> postList = postService.getAllPosts();
        model.addAttribute("postList", postList);
        return "index";
    }

    @GetMapping("/add-post")
    public String addPost() {
        return "add-post";
    }

    @PostMapping("/add-post")
    public String addPost(@ModelAttribute Post post) {
        postService.save(post);
        return "redirect:/";
    }

    @GetMapping("/upvote/{id}")
    public String upvote(@PathVariable(value = "id") long postId) {
        postService.upvote(postId);
        return "redirect:/";
    }

    @GetMapping("/downvote/{id}")
    public String downvote(@PathVariable(value = "id") long postId) {
        postService.downvote(postId);
        return "redirect:/";
    }

}
