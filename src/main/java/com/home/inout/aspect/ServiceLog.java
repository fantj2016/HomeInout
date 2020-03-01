package com.home.inout.aspect;

import java.lang.annotation.*;

/**
 * Created by Fant.J.
 * 2018/5/20 16:48
 */
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ServiceLog {
}
