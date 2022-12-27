package com.example.firstproject.DTO;

import com.example.firstproject.Article.Article;

public class ArticleForm {

    private String title;
    private String content;

    public ArticleForm(String title, String content) {
        this.title = title; //템플릿의 name과 이름 매칭시켜야 함.
        this.content = content;
    }

    @Override
    public String toString() {
        return "ArticleForm{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public Article toEntity() {

        return new Article(null,title,content);
    }
}
