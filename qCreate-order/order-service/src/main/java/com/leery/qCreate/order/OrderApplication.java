package com.leery.qCreate.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author leery
 * @since 2020/1/30 11:00
 */
@SpringBootApplication
@EnableFeignClients
@ComponentScan(basePackages={"com.java.core","com.leery.qCreate.order"})
public class OrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderApplication.class,args);
	}
}
