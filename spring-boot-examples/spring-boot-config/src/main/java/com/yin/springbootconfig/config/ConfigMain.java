package com.yin.springbootconfig.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date:2019/8/4
 * Time: 21:57
 * To change this template use File | Settings | File Templates.
 */

@Data
@ConfigurationProperties(prefix = "my")
//还可以加component就不用激活了
// @Component
public class ConfigMain {

    private Config1 config1 = new Config1();
    private Config2 config2 = new Config2();

}
