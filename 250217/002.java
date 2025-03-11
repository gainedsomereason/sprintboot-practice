package com.wx.c4_aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {

    @Around("execution(* com.wx.c4_aop.UserService.*(..))")
    public void log(ProceedingJoinPoint proceddingJoinPoint){

        long begin=System.currentTimeMillis();

        try {
            proceddingJoinPoint.proceed();
        } catch (Throwable e) {
            System.out.println("method error"+e.getMessage());
        }

        long end=System.currentTimeMillis();

        System.out.println("time:"+(end-begin)+"ms");
    }
}
