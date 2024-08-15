package com.Gaurav.JobListing.AOP;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Date;

@Aspect
@Component
public class LoggingAspect {

    private static  final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);

    @Before(value = "execution(* com.Gaurav.JobListing.controller.PostController.*(..))")
    public void beforeLog(JoinPoint joinPoint){
        LOGGER.info("Request " + joinPoint.getSignature() + " Started at time " + new Date() );
        System.out.println("Re " + joinPoint.getSignature() + " Started at time " + new Date());
    }

    @AfterReturning(value = "execution(* com.Gaurav.JobListing.controller.PostController.*(..))")
    public void afterlog(JoinPoint joinPoint){
        LOGGER.info("Request " + joinPoint.getSignature() + " Ended at time " + new Date() );
        System.out.println("Re " + joinPoint.getSignature() + " Ended at time " + new Date());
    }

    @AfterThrowing(value = "execution(* com.Gaurav.JobListing.controller.PostController.*(..))")
    public void throwinglog(JoinPoint joinPoint){
        LOGGER.info( "Issue occured: " + joinPoint.getSignature() + " Ended at time " + new Date());
        System.out.println("Issue occured: " + joinPoint.getSignature() + " Ended at time " + new Date());
    }
}
