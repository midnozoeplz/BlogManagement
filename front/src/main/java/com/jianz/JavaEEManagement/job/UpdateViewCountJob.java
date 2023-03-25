package com.jianz.JavaEEManagement.job;

import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.jianz.JavaEEManagement.domain.entity.Article;
import com.jianz.JavaEEManagement.service.ArticleService;
import com.jianz.JavaEEManagement.utils.RedisCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Jianz
 * @version 1.0
 * @Description  定时执行更新浏览量任务
 * @Email jianz8153.gmail.com
 * @Date 2023/2/4 18:21
 */
@Component
public class UpdateViewCountJob {

    @Autowired
    private RedisCache redisCache;

    @Autowired
    private ArticleService articleService;

    @Scheduled(cron = "0 0 */1 * * ?")
    public void updateViewCount(){
        //获取redis中的浏览量
        Map<String, Integer> viewCountMap = redisCache.getCacheMap("article:viewCount");

        List<Article> articles = viewCountMap.entrySet()
                .stream()
                .map(entry -> new Article(Long.valueOf(entry.getKey()), entry.getValue().longValue()))
                .collect(Collectors.toList());
        //更新到数据库中
        for (Article article : articles) {
            LambdaUpdateWrapper<Article> updateWrapper = new LambdaUpdateWrapper<>();
            updateWrapper.eq(Article :: getId, article.getId());
            updateWrapper.set(Article :: getViewCount, article.getViewCount());
            articleService.update(updateWrapper);
        }

    }
}