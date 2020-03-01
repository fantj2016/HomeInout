package com.home.inout.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.home.inout.aspect.ServiceLog;
import com.home.inout.entity.FamilyMemberInout;
import com.home.inout.service.IFamilyMemberInoutService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 * 家庭成员收支信息 前端控制器
 * </p>
 *
 * @author Fant.J
 * @since 2020-02-29
 */
@RestController
@RequestMapping("/family-member-inout")
public class FamilyMemberInoutController {

    @Resource
    private IFamilyMemberInoutService inoutService;
    @GetMapping("/list/{cur}/{size}")
    @ServiceLog
    public IPage<FamilyMemberInout> getList(@PathVariable long cur, @PathVariable long size){

        Page<FamilyMemberInout> page = new Page<>(cur, size);
        return inoutService.page(page, null);
    }
}

