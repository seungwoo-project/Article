package me.seungwoo.Article.controller.viewController;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import me.seungwoo.Article.domain.Article;
import me.seungwoo.Article.dto.ArticleListViewResponse;
import me.seungwoo.Article.dto.ArticleResponse;
import me.seungwoo.Article.service.BlogService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class BlogViewController {

    private final BlogService blogService;

    @GetMapping("/articles")
    public String getArticles(Model model) {
        List<ArticleListViewResponse> articleList = blogService.findAll().stream()
                .map(a -> new ArticleListViewResponse(a))
                .toList();

        model.addAttribute("articles", articleList);
        return "articleList";
    }
}
