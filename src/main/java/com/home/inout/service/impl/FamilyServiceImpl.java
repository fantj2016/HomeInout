package com.home.inout.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.home.inout.aspect.ServiceLog;
import com.home.inout.entity.Family;
import com.home.inout.mapper.FamilyMapper;
import com.home.inout.service.IFamilyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.Serializable;

/**
 * <p>
 * 家庭信息 服务实现类
 * </p>
 *
 * @author Fant.J
 * @since 2020-02-29
 */
@Service
public class FamilyServiceImpl extends ServiceImpl<FamilyMapper, Family> implements IFamilyService {

    @Resource
    private FamilyMapper familyMapper;

    @Override
    public boolean save(Family entity) {
        return familyMapper.insert(entity) > 0;
    }

    @Override
    public Family getById(Serializable id) {
        return familyMapper.selectById(id);
    }

}
