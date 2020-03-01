package com.home.inout.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.home.inout.entity.InoutType;
import com.home.inout.mapper.InoutTypeMapper;
import com.home.inout.service.IInoutTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
 * <p>
 * 收支类型 服务实现类
 * </p>
 *
 * @author Fant.J
 * @since 2020-02-29
 */
@Service
public class InoutTypeServiceImpl extends ServiceImpl<InoutTypeMapper, InoutType> implements IInoutTypeService {


    @Resource
    private InoutTypeMapper typeMapper;

    public IPage<InoutType> getList(Page<InoutType> page) {
        return typeMapper.selectPage(page);
    }
}
