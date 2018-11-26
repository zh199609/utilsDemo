package com.zl.regular;

import java.util.regex.Pattern;

public class RegularTest {
    public static final String REGEX_USERNAME = "^[a-zA-Z]\\w{5,17}$";
    // * 正则表达式：验证密码
    public static final String REGEX_PASSWORD = "^[a-zA-Z0-9]{6,16}$";
    // * 正则表达式：验证手机号
    public static final String REGEX_MOBILE = "^1([3]|[5]|[8])\\d{9}$";
    // * 正则表达式：验证邮箱
    public static final String REGEX_EMAIL = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
    // * 正则表达式：验证汉字
    public static final String REGEX_CHINESE = "^[\u4e00-\u9fa5],{0,}$";
    // * 正则表达式：验证车牌号
    public static final String REGEX_CarNo = "^[京津沪渝冀豫云辽黑湘皖鲁新苏浙赣鄂桂甘晋蒙陕吉闽贵粤青藏川宁琼使领A-Z]{1}[A-Z]{1}[A-Z0-9]{4}[A-Z0-9挂学警港澳]{1}$";
    // * 正则表达式：验证大于0数字
    public static final String REGEX_NUM = "^[1-9]\\d*$";
    // * 正则表达式：验证身份证
    public static final String REGEX_ID_CARD = "(^([1-9]{1}\\d{5}[1-2]{1}[09]{1}\\d{2}(([0]{1}[1-9]{1})|([1]{1}[012]{1}))(([0]{1}[1-9]{1})|([12]{1}\\d{1})|([3]{1}[01]{1}))(\\d{4}|(\\d{3}[X]{1})))$)|(^([1-9]{1}\\d{5}\\d{2}(([0]{1}[1-9]{1})|([1]{1}[012]{1}))(([0]{1}[1-9]{1})|([12]{1}\\d{1})|([3]{1}[01]{1}))\\d{3})$)";
    // * 正则表达式：验证URL
    public static final String REGEX_URL = "http(s)?://([\\w-]+\\.)+[\\w-]+(/[\\w\\-\\ ./?%&=]*)?";
    // * 正则表达式：验证IP地址
    public static final String REGEX_IP_ADDR = "(25[0-5]|2[0-4]\\d|[0-1]\\d{2}|[1-9]?\\d)";
    // * 正则表达式：姓名是2-4字的汉字
    public static final String REGEX_ChineseName = "^[\\u4e00-\\u9fa5]{2,4}$";

    // * 校验非法字符
    public static boolean isUnRuleText(String input) {
        if (input.toString().matches(".*[/\\\\:*?\"<>|\t].*") || input.toString().matches(".*\\p{So}.*")) {
            return true;
        }
        return false;
    }

    public static boolean isChineseName(String chineseName) {
        return Pattern.matches(REGEX_ChineseName, chineseName);
    }

    // * 校验用户名
    public static boolean isUsername(String username) {
        return Pattern.matches(REGEX_USERNAME, username);
    }

    // * 校验纯数字
    public static boolean isNums(String nums) {
        return Pattern.matches(REGEX_NUM, nums);
    }

    // * 校验密码
    public static boolean isPassword(String password) {
        return Pattern.matches(REGEX_PASSWORD, password);
    }

    // * 校验手机号
    public static boolean isMobile(String mobile) {
        return Pattern.matches(REGEX_MOBILE, mobile);
    }

    // * 校验车牌号
    public static boolean isCarNo(String car_no) {
        return Pattern.matches(REGEX_CarNo, car_no);
    }

    // * 校验邮箱
    public static boolean isEmail(String email) {
        return Pattern.matches(REGEX_EMAIL, email);
    }

    // * 校验汉字
    public static boolean isChinese(String chinese) {
        return Pattern.matches(REGEX_CHINESE, chinese);
    }

    // * 校验身份证
    public static boolean isIDCard(String idCard) {
        return Pattern.matches(REGEX_ID_CARD, idCard);
    }

    // * 校验URL
    public static boolean isUrl(String url) {
        return Pattern.matches(REGEX_URL, url);
    }

    // * 校验IP地址
    public static boolean isIPAddr(String ipAddr) {
        return Pattern.matches(REGEX_IP_ADDR, ipAddr);
    }

}
