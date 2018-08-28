package com.webhooks.admin

import org.aspectj.lang.JoinPoint
import org.aspectj.lang.annotation.Around
import org.aspectj.lang.annotation.Aspect

@Aspect
class AdminAOPInterceptor {

    @Around(value = "execution(* com.webhooks.PersonService.enablePersonAccount(..))")
    public void logPersonAccountActivation(JoinPoint joinPoint) {
        println("***************    AOP         ====>>>>    ${joinPoint?.args?.toList()}")
    }

}
