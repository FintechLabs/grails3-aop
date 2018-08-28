package com.webhooks

class ApplicationInterceptor {

    ApplicationInterceptor() {
        matchAll()
    }

    boolean before() {
        println("*************  ${new Date()}   ====>>>>    ${params?.toMapString()}")
        true
    }

    boolean after() { true }

    void afterView() {
        // no-op
    }

}
