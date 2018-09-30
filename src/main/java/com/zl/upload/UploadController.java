/**
 * 
 */
package com.zl.upload;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhanglei
 * @date 2018年9月5日
 * @Description
 */
@RestController
public class UploadController {

	@RequestMapping("/test")
	public void uploadFile(HttpServletRequest request, HttpServletResponse response) {
		File file = new File("D:/core_category.sql");
		System.out.println("原本文件的字节数："+file.length());
		FileInputStream fis = null; //文件输入流
	    BufferedInputStream bis = null;
		try {
		//response.setContentType("application/force-download");
        response.setHeader("Content-Disposition", "attachment;fileName=" + URLEncoder.encode(file.getName(), "utf-8"));
        byte[] buffer = new byte[1024];
        OutputStream os = null; //输出流
            os = response.getOutputStream();
            fis = new FileInputStream(file); 
            bis = new BufferedInputStream(fis);
            int len=0;
            int i=0;
            while((len=bis.read(buffer))>0){
            	i+=len;
                os.write(buffer,0,len);
            }
            System.out.println("下载文件的字节大小："+i);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally {
        	try {
				bis.close();
	            fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
        }
        System.out.println("----------file download: " + file.getName());

	}
}
