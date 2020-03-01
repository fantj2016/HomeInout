package com.home.inout.aspect;

import com.home.inout.utils.PrintUtil;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;

/**
* @Description:    java类作用描述
* @Author:         Fant.J
* @CreateDate:     2020/2/29 15:06
*/
@Aspect
@Slf4j
@Configuration
public class ServiceAspect {


    @Around("@annotation(com.home.inout.aspect.ServiceLog)")
    public Object logServiceInvoke(ProceedingJoinPoint pjp) throws Throwable {
        return doLog(pjp);
    }


    private Object doLog(ProceedingJoinPoint pjp) throws Throwable {
        if (log.isInfoEnabled()) {
            log.info("*****调用服务:" + pjp.getSignature().toLongString() + "*****");
            for (Object arg : pjp.getArgs()) {
                PrintUtil.printObj(arg, "服务参数");
            }
            try {
                Object proceed = pjp.proceed();
                PrintUtil.printObj(proceed, "返回结果:");
                return proceed;
            } catch (Throwable e) {
                log.info("抛出异常", e);
                throw e;
            } finally {
                log.info("*****调用服务结束******");
            }
        }
        return pjp.proceed();
    }
}
