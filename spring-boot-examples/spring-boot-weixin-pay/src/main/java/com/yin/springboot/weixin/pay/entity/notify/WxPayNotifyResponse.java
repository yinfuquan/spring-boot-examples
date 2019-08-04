package com.yin.springboot.weixin.pay.entity.notify;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import com.thoughtworks.xstream.annotations.XStreamOmitField;
import com.yin.springboot.weixin.pay.entity.xml.XStreamCDataConverter;
import com.yin.springboot.weixin.pay.entity.xml.XStreamInitializer;

import java.beans.ConstructorProperties;

@XStreamAlias("xml")
public class WxPayNotifyResponse {
    @XStreamOmitField
    private static final transient String FAIL = "FAIL";
    @XStreamOmitField
    private static final transient String SUCCESS = "SUCCESS";
    @XStreamAlias("return_code")
    @XStreamConverter(XStreamCDataConverter.class)
    private String returnCode;
    @XStreamConverter(XStreamCDataConverter.class)
    @XStreamAlias("return_msg")
    private String returnMsg;

    public static String fail(String msg) {
        WxPayNotifyResponse response = new WxPayNotifyResponse("FAIL", msg);
        XStream xstream = XStreamInitializer.getInstance();
        xstream.autodetectAnnotations(true);
        return xstream.toXML(response);
    }

    public static String success(String msg) {
        WxPayNotifyResponse response = new WxPayNotifyResponse("SUCCESS", msg);
        XStream xstream = XStreamInitializer.getInstance();
        xstream.autodetectAnnotations(true);
        return xstream.toXML(response);
    }

    public static WxPayNotifyResponse.WxPayNotifyResponseBuilder newBuilder() {
        return new WxPayNotifyResponse.WxPayNotifyResponseBuilder();
    }

    public String getReturnCode() {
        return this.returnCode;
    }

    public String getReturnMsg() {
        return this.returnMsg;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    public void setReturnMsg(String returnMsg) {
        this.returnMsg = returnMsg;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof WxPayNotifyResponse)) {
            return false;
        } else {
            WxPayNotifyResponse other = (WxPayNotifyResponse)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                Object this$returnCode = this.getReturnCode();
                Object other$returnCode = other.getReturnCode();
                if (this$returnCode == null) {
                    if (other$returnCode != null) {
                        return false;
                    }
                } else if (!this$returnCode.equals(other$returnCode)) {
                    return false;
                }

                Object this$returnMsg = this.getReturnMsg();
                Object other$returnMsg = other.getReturnMsg();
                if (this$returnMsg == null) {
                    if (other$returnMsg != null) {
                        return false;
                    }
                } else if (!this$returnMsg.equals(other$returnMsg)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof WxPayNotifyResponse;
    }

    public int hashCode() {
        int result = 1;
        Object $returnCode = this.getReturnCode();
        result = result * 59 + ($returnCode == null ? 43 : $returnCode.hashCode());
        Object $returnMsg = this.getReturnMsg();
        result = result * 59 + ($returnMsg == null ? 43 : $returnMsg.hashCode());
        return result;
    }

    public String toString() {
        return "WxPayNotifyResponse(returnCode=" + this.getReturnCode() + ", returnMsg=" + this.getReturnMsg() + ")";
    }

    public WxPayNotifyResponse() {
    }

    @ConstructorProperties({"returnCode", "returnMsg"})
    public WxPayNotifyResponse(String returnCode, String returnMsg) {
        this.returnCode = returnCode;
        this.returnMsg = returnMsg;
    }

    public static class WxPayNotifyResponseBuilder {
        private String returnCode;
        private String returnMsg;

        WxPayNotifyResponseBuilder() {
        }

        public WxPayNotifyResponse.WxPayNotifyResponseBuilder returnCode(String returnCode) {
            this.returnCode = returnCode;
            return this;
        }

        public WxPayNotifyResponse.WxPayNotifyResponseBuilder returnMsg(String returnMsg) {
            this.returnMsg = returnMsg;
            return this;
        }

        public WxPayNotifyResponse build() {
            return new WxPayNotifyResponse(this.returnCode, this.returnMsg);
        }

        public String toString() {
            return "WxPayNotifyResponse.WxPayNotifyResponseBuilder(returnCode=" + this.returnCode + ", returnMsg=" + this.returnMsg + ")";
        }
    }
}
