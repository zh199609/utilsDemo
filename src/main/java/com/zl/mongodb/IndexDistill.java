/**
 * 
 */
package com.zl.mongodb;

/**
 * @author	zhanglei
 * @date	2018年8月30日
 * @Description	指标提取数量（月）
 */
public class IndexDistill {

	private String date;//日期
	/**
	 * 指标个数
	 */
	private int number;
	
	/**
	 * 提取量
	 */
	private long distillNumber;

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public long getDistillNumber() {
		return distillNumber;
	}

	public void setDistillNumber(long distillNumber) {
		this.distillNumber = distillNumber;
	}

	@Override
	public String toString() {
		return "IndexDistill [date=" + date + ", number=" + number + ", distillNumber=" + distillNumber + "]";
	}

	
	
	
}
