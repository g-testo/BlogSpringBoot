package com.gt.blog.controllers;

import com.gt.blog.models.BlogPost;
import com.gt.blog.services.PostBlockchainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.web3j.model.Blog;

import java.math.BigInteger;
import java.util.List;

@RestController
@RequestMapping("/blockchain/posts")
@CrossOrigin()
public class PostBlockchainController {

    @Autowired
    private PostBlockchainService postBlockchainService;

    @PostMapping("")
    public String createPost(@RequestBody(required = false) BlogPost post) {
        try {
            postBlockchainService.createPost(post.getTitle(), post.getContent());
            return "Post created successfully";
        } catch (Exception e) {
            e.printStackTrace();
            return "Error creating post";
        }
    }

    @GetMapping("/{id}")
    public Blog.Post getPost(@PathVariable BigInteger id) {
        try {
            return postBlockchainService.getPost(id);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


    @GetMapping("")
    public List<Blog.Post> getAllPosts() {
        try {
            return postBlockchainService.getAllPosts();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
