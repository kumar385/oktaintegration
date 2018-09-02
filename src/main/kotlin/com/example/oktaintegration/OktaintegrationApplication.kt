package com.example.oktaintegration

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer


@SpringBootApplication
@EnableResourceServer
class OktaintegrationApplication

fun main(args: Array<String>) {
    runApplication<OktaintegrationApplication>(*args)
}


