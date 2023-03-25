package com.jianz.JavaEEManagement.runner;

import com.jianz.JavaEEManagement.domain.entity.Article;
import com.jianz.JavaEEManagement.mapper.ArticleMapper;
import com.jianz.JavaEEManagement.utils.RedisCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Jianz
 * @version 1.0
 * @Description 项目启动自动执行，将文章浏览量都存入redis中
 * @Email jianz8153.gmail.com
 * @Date 2023/2/4 17:55
 */
@Component
public class ViewCountRunner implements CommandLineRunner {

    @Autowired
    private ArticleMapper articleMapper;

    @Autowired
    private RedisCache redisCache;

    @Override
    public void run(String... args) throws Exception {
        // 查询博客信息 id viewCount
        List<Article> articles = articleMapper.selectList(null);
        Map<String, Integer> viewCountMap = articles.stream()
                .collect(Collectors.toMap(article -> article.getId().toString(), article -> {
                    return article.getViewCount().intValue();//
                }));
        //存储到redis中
        redisCache.setCacheMap("article:viewCount",viewCountMap);
    }
}
