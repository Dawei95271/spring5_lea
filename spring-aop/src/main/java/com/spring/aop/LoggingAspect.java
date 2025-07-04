package com.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


/**
 * @desc: todo
 * @author: yaowei
 * @since:2025/7/4
 */
@Aspect
@Component
public class LoggingAspect {


    @Before("execution(* com.spring.aop.test1.*.*(..))")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("方法调用: " + joinPoint.getSignature().getName());
    }

}