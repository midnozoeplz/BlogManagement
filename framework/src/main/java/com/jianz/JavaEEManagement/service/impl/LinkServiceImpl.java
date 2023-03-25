package com.jianz.JavaEEManagement.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.jianz.JavaEEManagement.constants.SystemConstants;
import com.jianz.JavaEEManagement.domain.ResponseResult;
import com.jianz.JavaEEManagement.domain.entity.Link;
import com.jianz.JavaEEManagement.domain.vo.LinkVo;
import com.jianz.JavaEEManagement.mapper.LinkMapper;
import com.jianz.JavaEEManagement.service.LinkService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jianz.JavaEEManagement.utils.BeanCopyUtils;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 友链 服务实现类
 * </p>
 *
 * @author jianz
 * @since 2023-02-01
 */
@Service
public class LinkServiceImpl extends ServiceImpl<LinkMapper, Link> implements LinkService {

    @Override
    public ResponseResult getAllLink() {
        //查询所有审核通过的
        LambdaQueryWrapper<Link> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Link::getStatus, SystemConstants.LINK_STATUS_NORMAL);
        List<Link> links = list(queryWrapper);
        //转换成vo
        List<LinkVo> linkVos = BeanCopyUtils.copyBeanList(links, LinkVo.class);
        //封装返回
        return ResponseResult.okResult(linkVos);
    }
}
