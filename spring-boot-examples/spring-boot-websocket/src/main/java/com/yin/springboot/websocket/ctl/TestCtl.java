package com.yin.springboot.websocket.ctl;

import com.yin.springboot.websocket.websocket.WebSocket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date:2019/8/4
 * Time: 21:09
 * To change this template use File | Settings | File Templates.
 */
@RestController
public class TestCtl {

    @Autowired
    private WebSocket webSocket;

    @RequestMapping("/test")
    public String test() {
        webSocket.sendMessage("websocket   seccess");
        return "ojbk";

    }
}
