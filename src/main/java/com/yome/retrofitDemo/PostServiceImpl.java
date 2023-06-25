package com.yome.retrofitDemo;

import org.springframework.stereotype.Component;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.io.IOException;
@Component
public class PostServiceImpl implements PostService {



        private Retrofit retrofit;
        private  PostApi postApi;
    public PostServiceImpl()
        {
            retrofit= RetrofitUtil.getRetrofitInstance();
           postApi=retrofit.create(PostApi.class);
        }

        @Override
        public Post createPost(Post post)
        {
            Post newPost=null;
            Call<Post> postCall=postApi.createPost(post);
            try {
                Response<Post> response= postCall.execute();
                if(response.isSuccessful() && response.body() != null){
                    System.out.println(response.body());
                    post=response.body();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            return post;
        }
}
