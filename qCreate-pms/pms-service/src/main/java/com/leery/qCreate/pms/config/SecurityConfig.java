package com.leery.qCreate.pms.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author leery
 * @since 2020/8/31 20:07
 */
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// 放行所有请求
		http.authorizeRequests().antMatchers("/**").permitAll();
		http.csrf().disable();
	}
}
