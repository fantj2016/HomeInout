package com.home.inout.utils;

import com.baomidou.mybatisplus.core.toolkit.ArrayUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.springframework.util.ClassUtils;
import org.springframework.util.CollectionUtils;

import java.io.Serializable;
import java.util.Collection;

/**
* @Description:    打印工具
* @Author:         Fant.J
* @CreateDate:     2020/2/29 15:01
*/
@Slf4j
public class PrintUtil implements Serializable {

    /**
     * 打印日志
     * @param arg 打印对象
     * @param prefix 日志前缀
     */
    public static void printObj(Object arg, String prefix){
        if (arg != null){
            if (arg.getClass().isArray()){
                if (ArrayUtils.isNotEmpty((Object[]) arg)){
                    Object[] args = (Object[]) arg;
                    for (Object object:args){
                        printObj(object,prefix);
                    }
                }
            }else  if (arg instanceof Collection){
                if (!CollectionUtils.isEmpty((Collection) arg)){
                    Collection collection = (Collection) arg;
                    for (Object object:collection){
                        printObj(object,prefix);
                    }
                }
            }
            //如果是基本类型或者包装类型
            if (ClassUtils.isPrimitiveOrWrapper(arg.getClass())){
                log.info(prefix+arg.toString());
            }else if (arg instanceof String){
                log.info(prefix+(String)arg);
            }else {
                //反射获取对象
                log.info(prefix+ ReflectionToStringBuilder.toString(arg));
            }
        }else {
            log.info(prefix+"  null");
        }
    }
}
