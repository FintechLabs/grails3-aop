package com.webhooks.person

import com.webhooks.Enums
import com.webhooks.User

class Person extends User {

    String firstName
    String lastName
    Enums.PersonType personType = Enums.PersonType.RECENT

    static transients = ['fullName']

    String getFullName() {
        this.firstName + " " + this.lastName
    }

}
