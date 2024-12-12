package com.cockatoo.domain.performance;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PerformanceMonitoringAspect {

    // Pointcut 정의 (서비스 계층의 모든 메서드에 적용)
    @Pointcut("execution(* com.cockatoo.domain.log.api.*.*(..)) || execution(* com.cockatoo.domain.log.service.*.*(..))")
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
