package com.zl.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
/**
 * 
 * @author	zhanglei
 * @date	2018年8月23日
 * @Description 使用JDK1.8的时间类
 */
public class TimeUtils {

	public final static String DEFAULT_PATTERN = "yyyy-MM-dd";
	public final static String FORMAT_PATTERN_YYYY = "yyyy";
	public final static String FORMAT_PATTERN_YYYY_MM = "yyyy-MM";
	public final static String FORMAT_LEFT_PATTERN_YYYY_MM = "yyyy/MM";
	public final static String FORMAT_PATTERN_YYYY_MM_DD = "yyyy-MM-dd";
	public final static String FORMAT_LEFT_PATTERN_YYYY_MM_DD = "yyyy/MM/dd";
	public final static String FORMAT_PATTERN_YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";
	public final static String FORMAT_LEFT_PATTERN_YYYY_MM_DD_HH_MM_SS = "yyyy/MM/dd HH:mm:ss";
	public final static String FORMAT_PATTERN_YYYY_MM_DD_HH_MM_SS_SSS = "yyyy-MM-dd HH:mm:ss:SSS";
	public final static String FORMAT_LEFT_PATTERN_YYYY_MM_DD_HH_MM_SS_SSS = "yyyy/MM/dd HH:mm:ss:SSS";
	
	/**
	 * 
	 * @Title: getLocalDate   
	 * @Description:   返回当前日期  yyyy-MM-dd
	 * @return: LocalDate
	 */
	public static LocalDate getLocalDate() {
		return LocalDate.now();
	}
	
	/**
	 * 
	 * @Title: getLocalDate   
	 * @Description:   根据格式化参数 返回当前日期
	 * @param pattern  
	 * @return: String
	 */
	public static String getLocalDate(String pattern) {
		 DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern(pattern);
		return LocalDate.now().format(ofPattern);
	}
	
	
	
	/**
	 * 
	 * @Title: getLocalDateTime   
	 * @Description:获取当前时间(默认格式)
	 * @return LocalDateTime
	 */
	public static LocalDateTime getLocalDateTime() {
		return LocalDateTime.now();
	}
	
	/**
	 * 
	 * @Title: getLocalDateTime   
	 * @Description:   根据格式化参数返回当前时间
	 * @param pattern
	 * @return: String
	 */
	public static String getLocalDateTime(String pattern) {
		 DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern(pattern);
		return LocalDateTime.now().format(ofPattern);
	}
	
	
	/**
	 * 
	 * @Title: getTimeByTimestamp   
	 * @Description:   根据时间戳和格式化参数 返回时间
	 * @param timestamp
	 * @param pattern
	 * @return: String
	 */
	public static String getTimeByTimestamp(long timestamp,String pattern) {
		LocalDateTime dateTime = LocalDateTime.ofEpochSecond(timestamp/1000, 0, ZoneOffset.ofHours(8));
		DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern(pattern);
		return dateTime.format(ofPattern);
	}

	
	/**
	 * 
	 * @Title: getDateByTimestamp   
	 * @Description:   根据时间戳和格式化参数返回日期
	 * @param timestamp
	 * @param pattern
	 * @return String
	 */
	public static String getDateByTimestamp(long timestamp,String pattern) {
		LocalDate ofEpochDay = LocalDate.ofEpochDay(timestamp/86400000);
		DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern(pattern);
		return ofEpochDay.format(ofPattern);
	}
	
	
	/**
	 * 
	 * @Title: getTimestampByLocalDate   
	 * @Description: 根据日期返回时间戳
	 * @param localDate
	 * @return long
	 */
	public static long getTimestampByLocalDate(LocalDate localDate) {
		
		LocalDateTime now=LocalDateTime.of(localDate, LocalTime.of(0, 0, 0, 0));
		long epochSecond = now.toInstant(ZoneOffset.of("+8")).toEpochMilli();
		return epochSecond;
		
	}
	
	/**
	 * 
	 * @Title: getTimestampByLocalDateTime   
	 * @Description:根据当前时间获取时间戳
	 * @param localDateTime
	 * @return long
	 */
	public static long getTimestampByLocalDateTime(LocalDateTime localDateTime) {
		
		return localDateTime.toInstant(ZoneOffset.of("+8")).toEpochMilli();
	}
	
	
	/**
	 * 
	 * @Title: getNowTimestamp   
	 * @Description:   返回当前时间戳  默认东8区   
	 * @return: String
	 */
	public static Long getNowTimestamp() {
		LocalDateTime now = LocalDateTime.now();
		long epochSecond = now.toInstant(ZoneOffset.of("+8")).toEpochMilli();
		return epochSecond;
	}
	
	
	
	
}
