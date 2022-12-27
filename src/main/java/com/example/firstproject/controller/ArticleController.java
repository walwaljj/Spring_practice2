package com.example.firstproject.controller;

import com.example.firstproject.entity.Article;
import com.example.firstproject.DTO.ArticleForm;
import com.example.firstproject.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ArticleController {
    @Autowired//스트링 부트가 미리 생성해 놓은 객체를 가져와 연결해줌.
    private ArticleRepository articleRepository;

    @GetMapping("/articles/new")
    public String newArticleForm(){
        return "articles/new";
    }
    @PostMapping("/articles/create")
    public String createArticle(ArticleForm form){

        System.out.println(form.toString());

        // 1.DTO 변환 -> Entity 로 .
        Article article = form.toEntity();
        System.out.println(article.toString());
        // 2.Repository 에게 Entity 를 DB에 저장하게 하기.
        Article saved = articleRepository.save(article);
                            //ㄴ ArticleRepository 가 상속받은 CRUD기능으로 article 값을 saved에 저장.

        System.out.println(saved.toString());

        return "";
    }
}
