package com.yin.springboot.common.utils.id;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date:2019/8/2
 * Time: 11:19
 * 单例 静态内部内实现
 */
public class SnowflakeGenerator2 {

    private SnowflakeGenerator2() {
    }

    private static class Snow {
        private static SnowFlake SNOWFLAKE = new SnowFlake(1, 2);
    }

    public static long getSnowId() {
        return Snow.SNOWFLAKE.nextId();
    }

}
