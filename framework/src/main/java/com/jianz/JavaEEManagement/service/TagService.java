package com.jianz.JavaEEManagement.service;

import com.jianz.JavaEEManagement.domain.ResponseResult;
import com.jianz.JavaEEManagement.domain.dto.TagListDto;
import com.jianz.JavaEEManagement.domain.entity.Tag;
import com.baomidou.mybatisplus.extension.service.IService;
import com.jianz.JavaEEManagement.domain.vo.PageVo;
import com.jianz.JavaEEManagement.domain.vo.TagVo2;

import java.util.List;

/**
 * <p>
 * 标签 服务类
 * </p>
 *
 * @author jianz
 * @since 2023-02-04
 */
public interface TagService extends IService<Tag> {

    ResponseResult<PageVo> pageTagList(Integer pageNum, Integer pageSize, TagListDto tagListDto);

    ResponseResult updateTag(Tag tag);

    List<TagVo2> listAllTag();
}

