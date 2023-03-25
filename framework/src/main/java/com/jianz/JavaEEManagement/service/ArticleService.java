package com.jianz.JavaEEManagement.service;

import com.jianz.JavaEEManagement.domain.dto.AddArticleDto;
import com.jianz.JavaEEManagement.domain.dto.ArticleDto;
import com.jianz.JavaEEManagement.domain.entity.Article;
import com.baomidou.mybatisplus.extension.service.IService;
import com.jianz.JavaEEManagement.domain.ResponseResult;
import com.jianz.JavaEEManagement.domain.vo.ArticleVo;
import com.jianz.JavaEEManagement.domain.vo.PageVo;

/**
 * <p>
 * 文章表 服务类
 * </p>
 *
 * @author jianz
 * @since 2023-01-31
 */
public interface ArticleService extends IService<Article> {

    ResponseResult hotArticleList();

    ResponseResult articleList(Integer pageNum, Integer pageSize, Long categoryId);

    ResponseResult getArticleDetail(Long id);

    ResponseResult updateViewCount(Long id);

    ResponseResult add(AddArticleDto article);

    PageVo selectArticlePage(Article article, Integer pageNum, Integer pageSize);

    ArticleVo getInfo(Long id);

    void edit(ArticleDto article);

}
