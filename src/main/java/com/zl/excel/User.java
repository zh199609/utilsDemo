/**
 * 
 */
package com.zl.excel;

import java.io.Serializable;
import java.util.Date;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelTarget;

/**
 * @author	zhanglei
 * @date	2018年8月24日
 * @Description	
 */
@ExcelTarget("student")
public class User implements Serializable{
	
	
	@Excel(name = "姓名_teacher", orderNum = "0")
	private String name;
	
	@Excel(name = "性别", replace = {"男_1", "女_2"}, orderNum = "2")
	private String sex;
	
	@Excel(name = "生日", exportFormat = "yyyy-MM-dd", orderNum = "1",width=20)
	private Date birthday;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public User(String name, String sex, Date birthday) {
		super();
		this.name = name;
		this.sex = sex;
		this.birthday = birthday;
	}

	public User() {
	}
	
	
	
}