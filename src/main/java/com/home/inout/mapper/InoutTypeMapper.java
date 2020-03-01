package com.home.inout.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.home.inout.entity.InoutType;

/**
 * <p>
 * 收支类型 Mapper 接口
 * </p>
 *
 * @author Fant.J
 * @since 2020-02-29
 */
public interface InoutTypeMapper extends BaseMapper<InoutType> {

    IPage<InoutType> selectPage(Page<?> page);
}
