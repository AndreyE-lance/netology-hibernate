package com.elantsev.netology.hibernate.config.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class Config extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("user")
                .password("{noop}123").authorities("READ_ONLY");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.formLogin().and().authorizeRequests().antMatchers("persons/by-city").permitAll()
                .and().authorizeRequests().antMatchers("/persons/by-age","/persons/by-name-surname")
                .hasAnyAuthority("READ_ONLY");
    }
}
