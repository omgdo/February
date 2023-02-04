package top.omgdo.handler;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Slf4j
//@Component
@Order(9999)
public class LogPrintHandler {

    @Before("pointcut()")
    public void before(){

    }

    @Pointcut("execution(* top.omgdo.controller.PaymentController.*(..))")
    public void pointcut(){}

    @Around("pointcut()")
    public Object around(ProceedingJoinPoint joinPoint){
        log.info("进入 {} 方法",joinPoint.getSignature().getName());
        for (Object arg : joinPoint.getArgs()) {
            log.info(arg.toString());
        }
        try {
            joinPoint.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        log.info("{} 方法执行完成.",joinPoint.getSignature().getName());
        return joinPoint;

    }

    public void after(){

    }
}
