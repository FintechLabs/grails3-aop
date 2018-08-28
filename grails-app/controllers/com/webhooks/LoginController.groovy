package com.webhooks

class LoginController {

    def auth = {
        render(view: '/auth/login')
    }

}
