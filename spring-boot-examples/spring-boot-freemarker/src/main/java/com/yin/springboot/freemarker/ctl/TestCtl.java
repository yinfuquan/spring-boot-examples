package com.yin.springboot.freemarker.ctl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date:2019/7/30
 * Time: 21:29
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class TestCtl {

@RequestMapping("/")
public  String test(Map<String,Object> map){

    map.put("hello","Hello FreeMarker");
    return "test.ftl";

}
}
