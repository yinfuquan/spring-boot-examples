package com.yin.springboot.common.utils;

import com.yin.springboot.common.utils.bean.SpringBeanUtils;
import com.yin.springboot.common.utils.jwt.WxJwtUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootCommonUtilsApplicationTests {

    @Test
    public void contextLoads() throws Exception {
        boolean beanFactory = SpringBeanUtils.containsBean("springBeanUtils");

        HashMap<String, String> map = new HashMap<>();
        map.put("name","yin");
        String key = WxJwtUtil.generateSignature(map, "key");
        System.out.println(key);
    }

}
