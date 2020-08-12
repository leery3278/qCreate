package com.leery.qCreate.ums;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.openfeign.EnableFeignClients;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author jiangli
 * @since 2020/1/27 19:55
 */
@SpringBootApplication
@EnableFeignClients
@EnableSwagger2
@RefreshScope
public class UmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(UmsApplication.class,args);
	}
}
