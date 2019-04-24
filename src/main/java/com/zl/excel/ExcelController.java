/**
 *
 */
package com.zl.excel;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.entity.ExportParams;
import cn.afterturn.easypoi.excel.entity.enmus.ExcelType;


/**
 * @author zhanglei
 * @date 2018年8月24日
 * @Description
 */
@RestController
public class ExcelController {

    @RequestMapping("/test")
    public String test(HttpServletRequest request, HttpServletResponse response) throws Exception {
        // 告诉浏览器用什么软件可以打开此文件
        //response.setHeader("content-Type", "application/vnd.ms-excel");
        // 下载文件的默认名称
        //	    //response.setHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode("用户数据表","UTF-8") + ".xlsx");
        //	    //编码
        //response.setCharacterEncoding("UTF-8");

        List<User> list = new ArrayList();
        list.add(new User("王五", "1", new Date()));
        list.add(new User("大铭", "1", new Date()));


        List<User> list1 = new ArrayList();
        list1.add(new User("大铭", "1", new Date()));
        list1.add(new User("王五", "1", new Date()));
		/*Workbook workbook = ExcelExportUtil.exportExcel(new ExportParams("计算机一班学生","学生"),
	            User .class, list);*/

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("title", new ExportParams("计算机一班学生", "学生", ExcelType.XSSF));
        map.put("entity", User.class);
        map.put("data", list);

        Map<String, Object> map2 = new HashMap<String, Object>();
        map2.put("title", new ExportParams("计算机二班学生", "学生", ExcelType.XSSF));
        map2.put("entity", User.class);
        map2.put("data", list1);


        List<Map<String, Object>> list2 = new ArrayList<>();
        list2.add(map);
        list2.add(map2);

        Workbook workbook = ExcelExportUtil.exportExcel(list2, ExcelType.XSSF);
        ExcelUtils.exportExcel(workbook, "我的学生.xlsx", response, request);
		/*OutputStream out = new FileOutputStream(new File("D:\\22.xlsx"));
		workbook.write(out);
		out.close();
		System.out.println("成功");*/
        return "SUCCESS";
        //workbook.write(response.getOutputStream());
    }
}
