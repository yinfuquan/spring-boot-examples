package com.yin.springboot.weixin.pay.ctl;

import com.yin.springboot.weixin.pay.entity.notify.WxPayNotifyResponse;
import com.yin.springboot.weixin.pay.entity.notify.WxScanPayNotifyResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date:2019/7/17
 * Time: 11:39
 * To change this template use File | Settings | File Templates.
 */

@Controller
public class WxPayCtl {

    //@ApiOperation(value = "扫码支付回调通知处理")
    @PostMapping("/notify/scanpay")
    public String parseScanPayNotifyResult(String xmlData)  {
//        final WxScanPayNotifyResult result = this.wxService.parseScanPayNotifyResult(xmlData);
        // TODO 根据自己业务场景需要构造返回对象
        return WxPayNotifyResponse.success("成功");
    }
}
