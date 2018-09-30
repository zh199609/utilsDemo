/**
 * 
 */
package com.zl.email;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author	zhanglei
 * @date	2018年8月23日
 * @Description	
 */
@RestController
public class MailController {

	@Autowired
	private EmailService emailService;
	
	@Autowired
	private EmailConfig emailConfig;
	
	@RequestMapping("/mail")
	public String mial() {
		emailService.sednAttachmentMail(emailConfig.getSendTo(), "测试","主题内容 ", new File("C:\\Users\\Administrator\\Desktop\\毕业设计参考页面.txt"));
		return "SUCCESS";
	}
	
	
	@RequestMapping("/mail1")
	public String simpleMail() {
		emailService.sendSimpleMail(emailConfig.getSendTo(), "测试", "主题内容测试");
		return "SUCCESS";
	}
}
