package com.example.oktaintegration

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.GetMapping
import java.security.Principal


@RestController
class OktaIntegrationController {

    @GetMapping("/oktaApp-Hello")
    fun sayHello(): String {
        return "Hello, User "
    }
}