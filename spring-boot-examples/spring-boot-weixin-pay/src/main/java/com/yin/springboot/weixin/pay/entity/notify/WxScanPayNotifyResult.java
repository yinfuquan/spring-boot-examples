package com.yin.springboot.weixin.pay.entity.notify;

import com.github.binarywang.wxpay.bean.result.BaseWxPayResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("xml")
public class WxScanPayNotifyResult extends BaseWxPayResult {
    private static final long serialVersionUID = 3381324564266118986L;
    @XStreamAlias("openid")
    private String openid;
    @XStreamAlias("is_subscribe")
    private String isSubscribe;
    @XStreamAlias("product_id")
    private String productId;

    public String getOpenid() {
        return this.openid;
    }

    public String getIsSubscribe() {
        return this.isSubscribe;
    }

    public String getProductId() {
        return this.productId;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public void setIsSubscribe(String isSubscribe) {
        this.isSubscribe = isSubscribe;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String toString() {
        return "WxScanPayNotifyResult(openid=" + this.getOpenid() + ", isSubscribe=" + this.getIsSubscribe() + ", productId=" + this.getProductId() + ")";
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof WxScanPayNotifyResult)) {
            return false;
        } else {
            WxScanPayNotifyResult other = (WxScanPayNotifyResult)o;
            if (!other.canEqual(this)) {
                return false;
            } else if (!super.equals(o)) {
                return false;
            } else {
                label49: {
                    Object this$openid = this.getOpenid();
                    Object other$openid = other.getOpenid();
                    if (this$openid == null) {
                        if (other$openid == null) {
                            break label49;
                        }
                    } else if (this$openid.equals(other$openid)) {
                        break label49;
                    }

                    return false;
                }

                Object this$isSubscribe = this.getIsSubscribe();
                Object other$isSubscribe = other.getIsSubscribe();
                if (this$isSubscribe == null) {
                    if (other$isSubscribe != null) {
                        return false;
                    }
                } else if (!this$isSubscribe.equals(other$isSubscribe)) {
                    return false;
                }

                Object this$productId = this.getProductId();
                Object other$productId = other.getProductId();
                if (this$productId == null) {
                    if (other$productId != null) {
                        return false;
                    }
                } else if (!this$productId.equals(other$productId)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof WxScanPayNotifyResult;
    }

    public int hashCode() {
        int result = 1;
        result = result * 59 + super.hashCode();
        Object $openid = this.getOpenid();
        result = result * 59 + ($openid == null ? 43 : $openid.hashCode());
        Object $isSubscribe = this.getIsSubscribe();
        result = result * 59 + ($isSubscribe == null ? 43 : $isSubscribe.hashCode());
        Object $productId = this.getProductId();
        result = result * 59 + ($productId == null ? 43 : $productId.hashCode());
        return result;
    }

    public WxScanPayNotifyResult() {
    }
}