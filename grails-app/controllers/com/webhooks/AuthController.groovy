package com.webhooks

import com.webhooks.person.Person
import grails.plugin.springsecurity.annotation.Secured

@Secured(value = ['permitAll'])
class AuthController {

    def register = {

    }

    def processRegister = {
        Person person = new Person()
        bindData(person, params)
        if (person.validate()) {
            person.save(flush: true)
            UserRole.create(person, Role.findByAuthority("ROLE_PERSON"), true)
            redirect(controller: 'person', action: 'index')
        } else {
            println(person?.errors?.allErrors?.toListString())
            render(view: "/auth/register", model: [person: person])
        }
    }

}
