package com.jianz.JavaEEManagement.mapper;

import com.jianz.JavaEEManagement.domain.entity.Article;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 文章表 Mapper 接口
 * </p>
 *
 * @author jianz
 * @since 2023-01-31
 */
@Mapper
public interface ArticleMapper extends BaseMapper<Article> {

}
