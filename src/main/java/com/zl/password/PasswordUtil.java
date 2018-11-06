package com.zl.password;

import java.security.MessageDigest;
import java.util.UUID;

public class PasswordUtil {

    /**
     * @Describe: SHA256 Hash
     * @param str
     * @return
     */
    public static String hashBySHA256(String str){
       MessageDigest messageDigest;
       String encodeStr = "";
       try {
           messageDigest = MessageDigest.getInstance("SHA-256");
           String algorithm = messageDigest.getAlgorithm();
           messageDigest.update(str.getBytes("UTF-8"));
           encodeStr = byte2Hex(messageDigest.digest());
       } catch (Exception e){
           e.printStackTrace();
       }
       return encodeStr;
   }

    /**
     * 将byte转为16进制
     * @param bytes
     * @return
     */
    private static String byte2Hex(byte[] bytes){
        StringBuffer stringBuffer = new StringBuffer();
        String temp = null;
        for (int i=0;i<bytes.length;i++){
            temp = Integer.toHexString(bytes[i] & 0xFF);
            if (temp.length()==1){
                //1得到一位的进行补0操作
                stringBuffer.append("0");
            }
            stringBuffer.append(temp);
        }
        return stringBuffer.toString();
    }

    /**
     * @Describe: 得到salt,通过UUID获取,去除了"-"
     * @return:String
     */
    public static String  getSalt(){
        return UUID.randomUUID().toString().replace("-", "").toLowerCase();
    }

}
