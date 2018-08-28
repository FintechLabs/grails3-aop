package com.webhooks.admin

import com.webhooks.HttpClientImpl
import grails.util.Holders
import org.aspectj.lang.JoinPoint
import org.aspectj.lang.annotation.Around
import org.aspectj.lang.annotation.Aspect
import org.grails.plugins.web.taglib.ApplicationTagLib

@Aspect
class AdminAOPInterceptor {

    @Around(value = "execution(* com.webhooks.PersonService.enablePersonAccount(..))")
    public void logPersonAccountActivation(JoinPoint joinPoint) {
        println("***************    AOP         ====>>>>    ${joinPoint?.args?.toList().first()?.enabled}")
        def g = Holders.grailsApplication.mainContext.getBean(ApplicationTagLib)
        HttpClientImpl httpClientImpl = Holders.grailsApplication.mainContext.getBean("httpClientImpl")
        Map<String, String> paramsMap = [:]
        paramsMap.put("username", "Test User #1")
        paramsMap.put("password", "Test Pwd #1")
        String urlStr = "${g.createLink(controller: 'public', action: 'testWebHook', absolute: true)}"
        Thread.start {
            (0..4).each {
                println("***********    Executing Webhooks  ===>>   ${it + 1}")
                httpClientImpl.post(paramsMap, urlStr)
            }
        }
    }

}
