package com.kodilla.patterns2.facade.api;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Aspect
@Component
public class WatcherProcessOrder {
    private static final Logger LOGGER = LoggerFactory.getLogger(WatcherProcessOrder.class);

    /*@Before("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))"+
            "&& args(userId,order) && target(object)")
    public void logEvent(Long userId, OrderDto order, Object object) {
        LOGGER.info("Class: "+ object.getClass().getName()+", Args: "+userId,order);
    }*/
    @Before("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))")
    public void logEvent() {
        LOGGER.info("logging");
    }
    @Around("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))")
    public Object measureTime(final ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Object result;
        try {
            long begin = System.currentTimeMillis();
            result = proceedingJoinPoint.proceed();
            long end = System.currentTimeMillis();
            LOGGER.info("Time consumed: " + (end - begin) + "[ms]");
        } catch (Throwable throwable) {
            LOGGER.error(throwable.getMessage());
            throw throwable;
        }
        return result;
    }
}
