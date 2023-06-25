package com.yome.retrofitDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/retrofit")
public class PostController {
    @Autowired
    private PostService postService;
    @PostMapping("/posts")
    public Post createPost(@RequestBody Post post)
    {
        return postService.createPost(post);
    }
}
