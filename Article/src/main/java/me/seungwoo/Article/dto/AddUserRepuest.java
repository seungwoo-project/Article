package me.seungwoo.Article.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class AddUserRepuest {
    private String email;
    private String password;
}
