package com.home.inout.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.home.inout.aspect.ServiceLog;
import com.home.inout.entity.Family;
import com.home.inout.service.IFamilyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 * 家庭信息 前端控制器
 * </p>
 *
 * @author Fant.J
 * @since 2020-02-29
 */
@RestController
@RequestMapping("/family")
public class FamilyController {

    @Resource
    private IFamilyService familyService;

    @GetMapping("/list/{cur}/{size}")
    @ServiceLog
    public IPage<Family> getList(@PathVariable long cur, @PathVariable long size){

        Page<Family> page = new Page<>(cur, size);
        return familyService.page(page, null);
    }
}

