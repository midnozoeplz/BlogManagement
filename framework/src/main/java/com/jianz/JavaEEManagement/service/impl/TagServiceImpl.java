package com.jianz.JavaEEManagement.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jianz.JavaEEManagement.domain.ResponseResult;
import com.jianz.JavaEEManagement.domain.dto.TagListDto;
import com.jianz.JavaEEManagement.domain.entity.Tag;
import com.jianz.JavaEEManagement.domain.vo.PageVo;
import com.jianz.JavaEEManagement.domain.vo.TagVo2;
import com.jianz.JavaEEManagement.mapper.TagMapper;
import com.jianz.JavaEEManagement.service.TagService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jianz.JavaEEManagement.utils.BeanCopyUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * <p>
 * 标签 服务实现类
 * </p>
 *
 * @author jianz
 * @since 2023-02-04
 */
@Service
public class TagServiceImpl extends ServiceImpl<TagMapper, Tag> implements TagService {

    @Override
    public ResponseResult<PageVo> pageTagList(Integer pageNum, Integer pageSize, TagListDto tagListDto) {
        //分页查询
        LambdaQueryWrapper<Tag> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(StringUtils.hasText((tagListDto.getName())),Tag::getName,tagListDto.getName());
        queryWrapper.eq(StringUtils.hasText(tagListDto.getRemark()),Tag::getRemark,tagListDto.getRemark());

        Page<Tag> page = new Page<>(pageNum,pageSize);
        page(page,queryWrapper);

        //封装数据
        PageVo pageVo = new PageVo(page.getRecords(), page.getTotal());
        return ResponseResult.okResult(pageVo);
    }

    @Override
    public ResponseResult updateTag(Tag tag) {
        updateById(tag);
        return ResponseResult.okResult();
    }

    @Override
    public List<TagVo2> listAllTag() {
        LambdaQueryWrapper<Tag> wrapper = new LambdaQueryWrapper<>();
        wrapper.select(Tag::getId,Tag::getName);
        List<Tag> list = list(wrapper);
        List<TagVo2> tagVos = BeanCopyUtils.copyBeanList(list, TagVo2.class);
        return tagVos;
    }
}
