package me.seungwoo.Article.controller;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import me.seungwoo.Article.domain.Article;
import me.seungwoo.Article.dto.AddArticleRequest;
import me.seungwoo.Article.dto.ArticleResponse;
import me.seungwoo.Article.service.BlogService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BlogController {

    private final BlogService blogService;

    // 글 생성
    @PostMapping("/api/articles")
    public ResponseEntity<Article> addArticle(@RequestBody AddArticleRequest request) {
        Article savedArticle = blogService.save(request);

        return ResponseEntity.status(HttpStatus.CREATED).body(savedArticle);
    }

    // 글 전체 조회
    @GetMapping("/api/articles")
    public ResponseEntity<List<ArticleResponse>> findAllArticles() {
        List<ArticleResponse> articles = blogService.findAll().stream().map(a -> new ArticleResponse(a)).toList();
        return ResponseEntity.ok().body(articles);
    }

    // 글 단일 조회
    @GetMapping("/api/articles/{id}")
    public ResponseEntity<ArticleResponse> findArticle(@PathVariable("id") Long id) {
        Article findArticle = blogService.findById(id);
        ArticleResponse articleResponse = new ArticleResponse(findArticle);
        return ResponseEntity.ok().body(articleResponse);
    }

    // 글 수정

    // 글 삭제
}
