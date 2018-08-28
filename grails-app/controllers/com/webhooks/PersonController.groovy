package com.webhooks

import grails.plugin.springsecurity.annotation.Secured

@Secured(["ROLE_PERSON"])
class PersonController {

    def index = {

    }

}
