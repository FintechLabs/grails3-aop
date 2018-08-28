package com.webhooks

import com.webhooks.person.Person
import grails.plugin.springsecurity.annotation.Secured

@Secured(["ROLE_ADMIN"])
class AdminController {

    PersonService personService

    def list = {
        List<Person> personList = Person.list()
        [personList: personList]
    }

    def enablePersonAccount = {
        Person person = Person.findByUniqueId(params.id)
        if (person) {
            personService.enablePersonAccount(person)
            flash.message = "Person account has activated successfully."
        } else {
            flash.message = "Something went wrong. Please try again."
        }
        redirect(action: 'list')
    }

}
