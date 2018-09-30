package com.zl.base64;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import org.apache.commons.codec.binary.Base64;

public class Base64Test {
	// 引入commons-codec-1.10.jar包，提供对base64算法的支持
	public static void main(String[] args) throws IOException {
		String src = "zhanglei";
		byte[] encodeBytes = Base64.encodeBase64(src.getBytes());
		System.out.println("encode: " + new String(encodeBytes));
		byte[] decodeBytes = Base64.decodeBase64(encodeBytes);
		System.out.println("decode: " + new String(decodeBytes));
		
		String encode = URLEncoder.encode("zhanglei啦啦啦", "utf-8");
		System.out.println(encode);
	}
}
