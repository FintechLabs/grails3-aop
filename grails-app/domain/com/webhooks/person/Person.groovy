package com.webhooks.person

import com.webhooks.Enums
import com.webhooks.User
import groovy.transform.ToString

@ToString(includeNames = true, includeFields = true, excludes = ["org_grails_datastore_gorm_GormValidateable__errors"])
class Person extends User {

    String firstName
    String lastName
    Enums.PersonType personType = Enums.PersonType.RECENT

    static transients = ['fullName']

    String getFullName() {
        this.firstName + " " + this.lastName
    }

}
