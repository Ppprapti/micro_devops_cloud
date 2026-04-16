package com.substring.blogapp.service;

import com.substring.blogapp.dto.ArticleDto;
import com.substring.blogapp.entity.Article;

import java.util.List;

public interface ArticleService {

    List<ArticleDto> getAll();
    ArticleDto getArticle(Long articleId);
    ArticleDto createArticle(ArticleDto articleDto);
    ArticleDto updateArticle(ArticleDto articleDto, Long articleId );
    void deleteArticle(Long articleId);

    List<ArticleDto> getArticleOfCategory(Long categoryId);

    List<ArticleDto> getArticleOfUser(Long userId);

}
