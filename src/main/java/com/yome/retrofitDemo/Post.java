package com.yome.retrofitDemo;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
@Data
public class Post {
    private int userId;
    private int id;
    private String title;
    private String body;
}
