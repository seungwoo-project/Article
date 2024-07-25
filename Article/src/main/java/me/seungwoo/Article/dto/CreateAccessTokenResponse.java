package me.seungwoo.Article.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CreateAccessTokenResponse {
    private String accessToken;
}
