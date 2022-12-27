package com.example.firstproject.repository;

import com.example.firstproject.entity.Article;
import org.springframework.data.repository.CrudRepository;


public interface ArticleRepository extends CrudRepository<Article,Long> {// CRUD 가 제공하는 기능을 활용함.
                                                        //ㄴ 1.관리대상ㄴArticle 의 id(대표값)타입.


}
