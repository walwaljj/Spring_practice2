package com.example.firstproject.DTO;

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
}
