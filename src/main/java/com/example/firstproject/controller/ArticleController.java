package com.example.firstproject.controller;

import com.example.firstproject.Article.Article;
import com.example.firstproject.DTO.ArticleForm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ArticleController {

    @GetMapping("/articles/new")
    public String newArticleForm(){
        return "articles/new";
    }
    @PostMapping("/articles/create")
    public String createArticle(ArticleForm form){
        System.out.println(form.toString());

        // 1.DTO 변환 -> Entity 로 .
        Article article = form.toEntity();

        // 2.Repository 에게 Entity 를 DB에 저장하게 하기.
        return "";
    }
}
