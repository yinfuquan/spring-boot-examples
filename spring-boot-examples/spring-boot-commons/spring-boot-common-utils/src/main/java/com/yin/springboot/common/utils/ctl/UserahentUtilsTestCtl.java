package com.yin.springboot.common.utils.ctl;

import com.taobao.diamond.md5.MD5;
import com.yin.springboot.common.utils.useragentutils.UserAgentUtils;
import eu.bitwalker.useragentutils.DeviceType;
import eu.bitwalker.useragentutils.OperatingSystem;
import eu.bitwalker.useragentutils.UserAgent;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date:2019/7/24
 * Time: 17:06
 * To change this template use File | Settings | File Templates.
 */
@RestController
public class UserahentUtilsTestCtl {
    @RequestMapping()
    public String getAgent(HttpServletRequest request) {
        String userAgent = UserAgentUtils.getUserAgent(request);

        UserAgent agent = UserAgent.parseUserAgentString(userAgent);

        boolean mobileDevice = agent.getOperatingSystem().isMobileDevice();



        if("COMPUTER".equalsIgnoreCase(DeviceType.COMPUTER.getName())){
            System.out.println("PC");
        }
        System.out.println(mobileDevice);
        OperatingSystem operatingSystem = agent.getOperatingSystem();

        System.out.println(userAgent);
        return userAgent;
    }


}
