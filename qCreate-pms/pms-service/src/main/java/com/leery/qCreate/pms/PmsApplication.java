package com.leery.qCreate.pms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.openfeign.EnableFeignClients;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author leery
 * @date 2020-07-20 14:16:38
 */
@SpringBootApplication
@EnableFeignClients
@EnableSwagger2
@RefreshScope
@MapperScan(basePackages = "com.leery.qCreate.pms.dao")
public class PmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PmsApplication.class,args);
	}
}
