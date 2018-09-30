package com.zl.generateId;

import java.util.UUID;

/*
 * UUID由以下几部分的组合：
（1）当前日期和时间，UUID的第一个部分与时间有关，如果你在生成一个UUID之后，过几秒又生成一个UUID，则第一个部分不同，其余相同。
（2）时钟序列。
（3）全局唯一的IEEE机器识别号，如果有网卡，从网
 */
public class UUIDWorker {
    public static void main(String[] args) {
        String uuid = getUuid();
    }
    
    public static String getUuid() {
        return UUID.randomUUID().toString().replace("-", "").toLowerCase();
    }
}
