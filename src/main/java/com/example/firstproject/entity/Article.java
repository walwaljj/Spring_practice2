package com.example.firstproject.entity;

import lombok.AllArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@ToString
@AllArgsConstructor
@Entity // DB가 해당 객체를 인식하게함.
public class Article {
    @GeneratedValue// 1,2,3,,, 등 순서를 자동을 생성해줌,
    @Id//같은 이름과 내용을 구분하기 위함.
    private Long id;
    @Column
    private String title;
    @Column
    private String content;

//    public Article() {}



//    public Article(Long id, String title, String content) {
//        this.id = id;
//        this.title = title;
//        this.content = content;
//    }

//    @Override
//    public String toString() {
//        return "Article{" +
//                "id=" + id +
//                ", title='" + title + '\'' +
//                ", content='" + content + '\'' +
//                '}';
//    }
}
