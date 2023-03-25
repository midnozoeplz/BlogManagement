package com.jianz.JavaEEManagement.service.impl;

import com.jianz.JavaEEManagement.domain.entity.ArticleTag;
import com.jianz.JavaEEManagement.mapper.ArticleTagMapper;
import com.jianz.JavaEEManagement.service.ArticleTagService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 文章标签关联表 服务实现类
 * </p>
 *
 * @author jianz
 * @since 2023-02-05
 */
@Service
public class ArticleTagServiceImpl extends ServiceImpl<ArticleTagMapper, ArticleTag> implements ArticleTagService {

}
