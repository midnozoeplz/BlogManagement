package com.jianz.JavaEEManagement.mapper;

import com.jianz.JavaEEManagement.domain.entity.ArticleTag;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 文章标签关联表 Mapper 接口
 * </p>
 *
 * @author jianz
 * @since 2023-02-05
 */
@Mapper
public interface ArticleTagMapper extends BaseMapper<ArticleTag> {

}
