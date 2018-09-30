/**
 * 
 */
package com.zl.mongodb;

import java.io.Serializable;



/**
 * @author	zhanglei
 * @date	2018年9月3日
 * @Description	
 */
public class IndexDistillDetail implements Serializable{
	
	private String date;
	
	private String code;
	
	private String codeName;
	
	private int number;

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCodeName() {
		return codeName;
	}

	public void setCodeName(String codeName) {
		this.codeName = codeName;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public IndexDistillDetail(String date, String code, String codeName, int number) {
		super();
		this.date = date;
		this.code = code;
		this.codeName = codeName;
		this.number = number;
	}

	public IndexDistillDetail() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "IndexDistillDetail [date=" + date + ", code=" + code + ", codeName=" + codeName + ", number=" + number
				+ "]";
	}
	
	

}