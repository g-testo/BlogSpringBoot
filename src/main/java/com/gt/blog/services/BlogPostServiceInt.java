package com.gt.blog.services;

import com.gt.blog.models.BlogPost;

import java.util.List;

public interface BlogPostServiceInt {
    List<BlogPost> getAllBlogPosts();
    BlogPost getBlogPostById(Long id);
    BlogPost createBlogPost(BlogPost blogPost);
    BlogPost updateBlogPost(Long id, BlogPost blogPost);
    void deleteBlogPost(Long id);
}
