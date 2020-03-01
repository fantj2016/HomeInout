package com.home.inout.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.home.inout.entity.InoutType;

/**
 * <p>
 * 收支类型 服务类
 * </p>
 *
 * @author Fant.J
 * @since 2020-02-29
 */
public interface IInoutTypeService extends IService<InoutType> {

    IPage<InoutType> getList(Page<InoutType> page);
}
