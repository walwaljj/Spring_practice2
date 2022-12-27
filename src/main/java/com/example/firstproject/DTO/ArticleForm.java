package com.example.firstproject.DTO;

import com.example.firstproject.entity.Article;

public class ArticleForm {

    private String title;
    private String content;

    public ArticleForm(String title, String content) {
        this.title = title; //템플릿의 name과 이름 매칭시켜야 함.
        this.content = content;
    }



    public Article toEntity() {

        return new Article(null,title,content);// Article 형태인 toEntitiy 메소드 형식이기 때문에
                                                    // return 값으로 Article 을 줘야함.
                                                    // 이때 Article 생성자의 형태에 맞춰주고 , DTO -> Entity로 변환함.
    }

    @Override
    public String toString() {
        return "ArticleForm{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
