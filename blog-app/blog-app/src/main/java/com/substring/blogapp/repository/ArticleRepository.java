package com.substring.blogapp.repository;

import com.substring.blogapp.entity.Article;
import com.substring.blogapp.entity.Category;
import com.substring.blogapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//all the
public interface ArticleRepository extends JpaRepository<Article, Long> {

    //custom methods
    List<Article> findByCategory(Category category);
    List<Article> findByUser(User user);
    List<Article> findByCategoryAndUser(Category category, User user);

}
