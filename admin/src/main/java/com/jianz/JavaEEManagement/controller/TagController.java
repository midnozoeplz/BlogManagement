package com.jianz.JavaEEManagement.controller;


import com.jianz.JavaEEManagement.domain.ResponseResult;
import com.jianz.JavaEEManagement.domain.dto.TagDto;
import com.jianz.JavaEEManagement.domain.dto.TagListDto;
import com.jianz.JavaEEManagement.domain.entity.Tag;
import com.jianz.JavaEEManagement.domain.vo.PageVo;
import com.jianz.JavaEEManagement.domain.vo.TagVo1;
import com.jianz.JavaEEManagement.domain.vo.TagVo2;
import com.jianz.JavaEEManagement.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 标签 前端控制器
 * </p>
 *
 * @author jianz
 * @since 2023-02-04
 */
@RestController
@RequestMapping("/content/tag")
public class TagController {
    @Autowired
    private TagService tagService;

    @GetMapping("/list")
    public ResponseResult<PageVo> list(Integer pageNum, Integer pageSize, TagListDto tagListDto) {
        return tagService.pageTagList(pageNum, pageSize, tagListDto);
    }

    @PostMapping
    public ResponseResult addTag(@RequestBody TagDto tagDto){
        Tag tag = new Tag();
        tag.setName(tagDto.getName());
        tag.setRemark(tagDto.getRemark());
        tagService.save(tag);
        return ResponseResult.okResult();
    }

    @DeleteMapping("{id}")
    public ResponseResult deleteTag(@PathVariable("id") int id){
        tagService.removeById(id);
        return ResponseResult.okResult();
    }

    @GetMapping("{id}")
    public ResponseResult getById(@PathVariable("id") int id){
        Tag tag = tagService.getById(id);
        TagVo1 tagVo1 = new TagVo1(tag.getId().intValue(), tag.getName(), tag.getRemark());
        return ResponseResult.okResult(tagVo1);
    }

    @PutMapping
    public ResponseResult updateTag(@RequestBody Tag tag){

        return tagService.updateTag(tag);
    }

    @GetMapping("/listAllTag")
    public ResponseResult listAllTag(){
        List<TagVo2> list = tagService.listAllTag();
        return ResponseResult.okResult(list);
    }
}
