package com.home.inout;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.home.inout.aspect.ServiceLog;
import com.home.inout.entity.Family;
import com.home.inout.service.IFamilyService;
import lombok.val;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Map;

@SpringBootTest
class InoutApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    private IFamilyService familyService;
    @Test
    void save() {
        Family family = new Family();
        family.setUsername("123");
        family.setPassword("123");
        family.setAddress("北京市");
        val save = familyService.save(family);
        System.out.println(save);
    }

    @Test
    void get(){
        Family byId = familyService.getById(1);
        System.out.println(byId);
    }

    @Test
    @ServiceLog
    void warpper(){
        Map<String, Object> map = familyService.getMap(new QueryWrapper<Family>().eq("address", "北京市"));
        for (Map.Entry<String, Object> entry: map.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }

}
