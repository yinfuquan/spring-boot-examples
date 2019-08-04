package com.yin.springboot.common.utils.id;

/**
 * 雪花生成18位id
 * 生成id随时间递增
 */
public class SnowflakeGenerator {

    private static SnowFlake worker = new SnowFlake(0, 1);

    private SnowflakeGenerator() {
    }

    public static long getCode() {
        return worker.nextId();
    }
}