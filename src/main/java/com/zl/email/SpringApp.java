/**
 * 
 */
package com.zl.email;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author	zhanglei
 * @date	2018年8月23日
 * @Description	
 */
//@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class SpringApp {

	public static void main(String[] args) {
		SpringApplication.run(SpringApp.class, args);
	}
}
