package com.webhooks

import com.webhooks.person.Person

class PersonService {

    void enablePersonAccount(Person person) {
        person.enabled = true
        person.save(flush: true)
    }

}
