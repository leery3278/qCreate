package com.leery.qCreate.order.config;

import com.leery.qCreate.order.interceptor.LoginInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author leery
 * @since 2020/1/29 13:00
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
	@Autowired
	private LoginInterceptor loginInterceptor;

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		//  /** 所有路径    /* 一级路径
		registry.addInterceptor(loginInterceptor).addPathPatterns("/**");
	}
}
