package com.api.superbay.security;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		auth.inMemoryAuthentication().withUser("admin").password("1234").roles(ROOT);
//	}
//	
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http.authorizeRequests().antMatchers("*/client/*").permitAll()
//		.anyRequest().authenticated()
//		.and().httpBasic()
//		.and().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
//		.and().csrf().disable() ;
//	}
}
