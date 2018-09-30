/**
 * 
 *//*
package com.zl.log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

*//**
 * @author	zhanglei
 * @date	2018年8月24日
 * @Description	
 *//*
@RestController
public class Log4j2 {
	private static final Logger log =LogManager.getLogger(Log4j2.class);
	@RequestMapping("/test")
	public String test() {
		log.info("info");
		log.debug("debug");
		log.warn("warn");
		return "SUCCESS";
		
	}
}
*/