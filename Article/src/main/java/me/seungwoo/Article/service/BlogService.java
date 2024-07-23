package me.seungwoo.Article.service;

import lombok.RequiredArgsConstructor;
import me.seungwoo.Article.domain.Article;
import me.seungwoo.Article.dto.AddArticleRequest;
import me.seungwoo.Article.dto.UpdateArticleRequest;
import me.seungwoo.Article.repository.BlogRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class BlogService {

    private final BlogRepository blogRepository;

    // 저장
    public Article save(AddArticleRequest request) {
        return blogRepository.save(request.toEntity());
    }

    // 목록 전체 조회
    public List<Article> findAll() {
        return blogRepository.findAll();
    }

    // 단일 조회
    public Article findById(Long id) {
        return blogRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("not found : " + id));
    }

    // 글 수정
    @Transactional
    public Article update(Long id, UpdateArticleRequest updateArticleRequest) {
        Article findArticle = blogRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("not found: " + id));

        findArticle.update(updateArticleRequest.getTitle(), updateArticleRequest.getContent());
        return findArticle;
    }

    // 글 삭제
    public void deleteById(Long id) {
        blogRepository.deleteById(id);
    }
}
