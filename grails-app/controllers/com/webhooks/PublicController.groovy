package com.webhooks

import grails.converters.JSON
import grails.plugin.springsecurity.SpringSecurityService
import grails.plugin.springsecurity.annotation.Secured

@Secured(value = ['permitAll'])
class PublicController {

    SpringSecurityService springSecurityService

    def landing = {}

    def authSuccess = {
        User user = springSecurityService.currentUser
        UserRole userRole = UserRole.findByUser(user)
        if (userRole.role.authority.equals("ROLE_ADMIN")) {
            redirect(controller: 'admin', action: 'list')
        } else {
            redirect(controller: "person", action: "index")
        }
    }

    def testWebHook = {
        def result = [:]
        result.putAll(params)
        render result as JSON
    }

}
