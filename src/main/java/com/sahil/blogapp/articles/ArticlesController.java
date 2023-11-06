package com.sahil.blogapp.articles;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import com.sahil.blogapp.users.UserEntity;

@RestController
@RequestMapping("/articles")
public class ArticlesController {

    @GetMapping("")
    String getArticles() {
        return "get all articles";
    }

    @GetMapping("/{id}")
    String getArticleById(@PathVariable("id") String id) {
        return "get article with id: " + id;
    }

    @PostMapping("")
    String createArticle(@AuthenticationPrincipal UserEntity user) {
        return "create article called by " + user.getUsername();
    }
}
