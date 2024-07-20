package com.gt.blog.services;

import com.gt.blog.models.BlogPost;
import com.gt.blog.repositories.BlogPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogPostServiceImpl implements BlogPostServiceInt {

    @Autowired
    private BlogPostRepository blogPostRepository;

    @Override
    public List<BlogPost> getAllBlogPosts() {
        return blogPostRepository.findAll();
    }

    @Override
    public BlogPost getBlogPostById(Long id) {
        return blogPostRepository.findById(id).orElse(null);
    }

    @Override
    public BlogPost createBlogPost(BlogPost blogPost) {
        return blogPostRepository.save(blogPost);
    }

    @Override
    public BlogPost updateBlogPost(Long id, BlogPost blogPost) {
        BlogPost existingBlogPost = blogPostRepository.findById(id).orElse(null);
        if (existingBlogPost != null) {
            existingBlogPost.setTitle(blogPost.getTitle());
            existingBlogPost.setContent(blogPost.getContent());
            return blogPostRepository.save(existingBlogPost);
        }
        return null;
    }

    @Override
    public void deleteBlogPost(Long id) {
        blogPostRepository.deleteById(id);
    }
}
