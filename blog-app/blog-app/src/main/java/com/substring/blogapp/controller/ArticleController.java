package com.substring.blogapp.controller;

import com.substring.blogapp.dto.ArticleDto;
import com.substring.blogapp.service.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/articles")
@RequiredArgsConstructor
public class ArticleController {


    private final ArticleService articleService;

    //@ResponseBody
    //@RequestMapping(value = "/",method = RequestMethod.POST)
    @PostMapping // requestmapping with post method
    public ResponseEntity<ArticleDto> createArticle(@RequestBody ArticleDto articleDto) {
        ArticleDto articleDto1 = articleService.createArticle(articleDto);
        return new ResponseEntity<>(articleDto1, HttpStatus.CREATED);
    }

    @PutMapping("/{articleId}")
    public ArticleDto update(@PathVariable Long articleId, @RequestBody ArticleDto articleDto) {
        return articleService.updateArticle(articleDto, articleId);
    }

    @GetMapping("/{articleId}")
    public ArticleDto getArticle(@PathVariable("articleId") Long articleId) {
        return articleService.getArticle(articleId);
    }

    @GetMapping
    public List<ArticleDto> getAll() {
        return articleService.getAll();
    }

    @DeleteMapping("/{articleId}")
    public ResponseEntity<Void> deleteArticle(@PathVariable Long articleId) {
        articleService.deleteArticle(articleId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    //create api to get articles of specific category
    @GetMapping("/category/{categoryId}")
    public List<ArticleDto> getArticlesByCategory(@PathVariable("categoryId") Long categoryId) {
        return articleService.getArticleOfCategory(categoryId);
    }

    @GetMapping("/user/{userId}")
    public List<ArticleDto> getArticlesByUser(@PathVariable("userId") Long userId) {
        return articleService.getArticleOfUser(userId);
    }

}
