package com.yome.retrofitDemo;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface PostApi {
    @POST("/posts")
    Call<Post> createPost(@Body Post post);
}
