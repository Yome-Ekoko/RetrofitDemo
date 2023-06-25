package com.yome.retrofitDemo;

import org.springframework.stereotype.Service;

@Service
public interface PostService {

    public  Post createPost(Post post);
}
