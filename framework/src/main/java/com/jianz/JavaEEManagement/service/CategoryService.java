package com.jianz.JavaEEManagement.service;

import com.jianz.JavaEEManagement.domain.ResponseResult;
import com.jianz.JavaEEManagement.domain.entity.Category;
import com.baomidou.mybatisplus.extension.service.IService;
import com.jianz.JavaEEManagement.domain.vo.CategoryVo;
import com.jianz.JavaEEManagement.domain.vo.PageVo;

import java.util.List;

/**
 * <p>
 * 分类表 服务类
 * </p>
 *
 * @author jianz
 * @since 2023-02-01
 */
public interface CategoryService extends IService<Category> {

    ResponseResult getCategoryList();

    List<CategoryVo> listAllCategory();

    PageVo selectCategoryPage(Category category, Integer pageNum, Integer pageSize);
}
