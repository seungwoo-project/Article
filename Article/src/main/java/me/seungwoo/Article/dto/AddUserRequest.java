package me.seungwoo.Article.dto;

import lombok.Data;

@Data
public class AddUserRequest {
    private String email;
    private String password;
}
