package com.cockatoo.global.performance;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PerformanceMonitoringAspect {

    // API 계층의 Pointcut 정의
    @Pointcut("execution(* com.cockatoo.domain.log.api.*.*(..))")
    public void apiLayerMethods() {}

    // Service 계층의 Pointcut 정의
    @Pointcut("execution(* com.cockatoo.domain.log.service.*.*(..))")
    public void serviceLayerMethods() {}

    // API 및 Service 계층의 Pointcut 결합
    @Pointcut("apiLayerMethods() || serviceLayerMethods()")
    public void controllerAndServiceMethods() {}

    // 성능 측정 Advice
    @Around("controllerAndServiceMethods()")
    public Object monitorPerformance(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        Object result = joinPoint.proceed();
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println("Method " + joinPoint.getSignature().getName() + " executed in " + executionTime + "ms");
        return result;
    }
}
