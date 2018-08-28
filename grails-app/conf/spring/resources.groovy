import com.webhooks.admin.AdminAOPInterceptor

// Place your Spring DSL code here
beans = {

    adminAOPInterceptor(AdminAOPInterceptor)

    xmlns aop: "http://www.springframework.org/schema/aop"
    aop {
        config("proxy-target-class": true)
    }
}
