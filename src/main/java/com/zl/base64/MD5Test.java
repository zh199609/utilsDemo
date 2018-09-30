package com.zl.base64;

import java.security.MessageDigest;

public class MD5Test {
	public static void main(String[] args) throws Exception {
		String str="shanghai";
		
		MessageDigest digest = MessageDigest.getInstance("MD5");
		System.out.println(new String(digest.digest(str.getBytes())));
		
	}
}
