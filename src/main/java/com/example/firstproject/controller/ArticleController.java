package com.example.firstproject.controller;

import com.example.firstproject.entity.Article;
import com.example.firstproject.DTO.ArticleForm;
import com.example.firstproject.repository.ArticleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j//simple loging fas for java? : 로깅(로그를 남김)을 위한 어노테이션.
public class ArticleController {
    @Autowired//스트링 부트가 미리 생성해 놓은 객체를 가져와 연결해줌.
    private ArticleRepository articleRepository;

    @GetMapping("/articles/new")
    public String newArticleForm(){
        return "articles/new";
    }
    @PostMapping("/articles/create")
    public String createArticle(ArticleForm form){

//        System.out.println(form.toString());
//        -> 로깅기능으로 대체.
        log.info(form.toString());// println 이 아닌 log로 기록을 남김 . 왜? 성능향상 + 기록을 남길 수 있음.


        // 1.DTO 변환 -> Entity 로 .
        Article article = form.toEntity();
//        System.out.println(article.toString());
        log.info(article.toString());


        // 2.Repository 에게 Entity 를 DB에 저장하게 하기.
        Article saved = articleRepository.save(article);
                            //ㄴ ArticleRepository 가 상속받은 CRUD기능으로 article 값을 saved에 저장.
//        System.out.println(saved.toString());
        log.info(saved.toString());

        return "";
    }
}
