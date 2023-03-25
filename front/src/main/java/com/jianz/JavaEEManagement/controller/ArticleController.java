package com.jianz.JavaEEManagement.controller;


import com.jianz.JavaEEManagement.annotation.SystemLog;
import com.jianz.JavaEEManagement.service.impl.ArticleServiceImpl;
import com.jianz.JavaEEManagement.domain.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 文章表 前端控制器
 * </p>
 *
 * @author jianz
 * @since 2023-01-31
 */
@RestController
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private ArticleServiceImpl articleService;

    @GetMapping("/hotArticleList")
    @SystemLog(businessName = "获取热门文章")
    public ResponseResult hotArticleList(){
        ResponseResult result =  articleService.hotArticleList();
        return result;
    }


    @GetMapping("/articleList")
    @SystemLog(businessName = "获取文章")
    public ResponseResult articleList(Integer pageNum,Integer pageSize,Long categoryId){
        return articleService.articleList(pageNum,pageSize,categoryId);
    }


    @GetMapping("/{id}")
    @SystemLog(businessName = "查看指定文章")
    public ResponseResult getArticleDetail(@PathVariable("id") Long id){
        return articleService.getArticleDetail(id);
    }

    @PutMapping("/updateViewCount/{id}")
    @SystemLog(businessName = "浏览量自增")
    public ResponseResult updateViewCount(@PathVariable("id") Long id){
        return articleService.updateViewCount(id);
    }

//    @GetMapping("/test")
//    public List<Article> test(){
//        List<Article> articles = articleService.getBaseMapper().selectList(null);
//        return articles;
//    }
}

