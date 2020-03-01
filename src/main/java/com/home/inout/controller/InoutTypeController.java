package com.home.inout.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.home.inout.aspect.ServiceLog;
import com.home.inout.entity.InoutType;
import com.home.inout.service.IInoutTypeService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * <p>
 * 收支类型 前端控制器
 * </p>
 *
 * @author Fant.J
 * @since 2020-02-29
 */
@RestController
@RequestMapping("/inout-type")
public class InoutTypeController {

    @Resource
    private IInoutTypeService typeService;

    @GetMapping("/list/{cur}/{size}")
    @ServiceLog
    public IPage<InoutType> getList(@PathVariable long cur, @PathVariable long size){

        Page<InoutType> page = new Page<>(cur, size);
        return typeService.getList(page);
    }

    @GetMapping("/get/{id}")
    public InoutType getById(@PathVariable String id){
        return typeService.getById(id);
    }
    @PostMapping("/add")
    public boolean add(InoutType inoutType){
        return typeService.save(inoutType);
    }

    @GetMapping("/del/{id}")
    public boolean del(@PathVariable String id){
        return typeService.removeById(id);
    }

    @PostMapping("/update")
    public boolean update(InoutType inoutType){
        return typeService.updateById(inoutType);
    }

}

