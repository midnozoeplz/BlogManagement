package com.jianz.JavaEEManagement.mapper;

import com.jianz.JavaEEManagement.domain.entity.Comment;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 评论表 Mapper 接口
 * </p>
 *
 * @author jianz
 * @since 2023-02-02
 */
@Mapper
public interface CommentMapper extends BaseMapper<Comment> {

}
