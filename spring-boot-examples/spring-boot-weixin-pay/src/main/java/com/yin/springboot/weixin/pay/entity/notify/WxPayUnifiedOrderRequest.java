//package com.yin.springboot.weixin.pay.entity.notify;
//
//import com.thoughtworks.xstream.annotations.XStreamAlias;
//import org.apache.commons.lang3.StringUtils;
//import org.springframework.beans.factory.annotation.Required;
//
//import java.beans.ConstructorProperties;
//
//@XStreamAlias("xml")
//public class WxPayUnifiedOrderRequest extends BaseWxPayRequest {
//    private static final long serialVersionUID = 4611350167813931828L;
//    @XStreamAlias("version")
//    private String version;
//    @XStreamAlias("device_info")
//    private String deviceInfo;
//    @Required
//    @XStreamAlias("body")
//    private String body;
//    @XStreamAlias("detail")
//    private String detail;
//    @XStreamAlias("attach")
//    private String attach;
//    @Required
//    @XStreamAlias("out_trade_no")
//    private String outTradeNo;
//    @XStreamAlias("fee_type")
//    private String feeType;
//    @Required
//    @XStreamAlias("total_fee")
//    private Integer totalFee;
//    @Required
//    @XStreamAlias("spbill_create_ip")
//    private String spbillCreateIp;
//    @XStreamAlias("time_start")
//    private String timeStart;
//    @XStreamAlias("time_expire")
//    private String timeExpire;
//    @XStreamAlias("goods_tag")
//    private String goodsTag;
//    @Required
//    @XStreamAlias("notify_url")
//    private String notifyUrl;
//    @Required
//    @XStreamAlias("trade_type")
//    private String tradeType;
//    @XStreamAlias("product_id")
//    private String productId;
//    @XStreamAlias("limit_pay")
//    private String limitPay;
//    @XStreamAlias("openid")
//    private String openid;
//    @XStreamAlias("sub_openid")
//    private String subOpenid;
//    @XStreamAlias("receipt")
//    private String receipt;
//    @XStreamAlias("scene_info")
//    private String sceneInfo;
//    @XStreamAlias("fingerprint")
//    private String fingerprint;
//
//    public void setNotifyUrl(String notifyUrl) {
//        this.notifyUrl = notifyUrl;
//    }
//
//    public void setTradeType(String tradeType) {
//        this.tradeType = tradeType;
//    }
//
//    protected void checkConstraints() throws WxPayException {
//        if ("NATIVE".equals(this.getTradeType()) && StringUtils.isBlank(this.getProductId())) {
//            throw new WxPayException("当trade_type是'NATIVE'时，需指定非空的product_id值");
//        }
//    }
//
//    public void checkAndSign(WxPayConfig config) throws WxPayException {
//        if (StringUtils.isBlank(this.getNotifyUrl())) {
//            this.setNotifyUrl(config.getNotifyUrl());
//        }
//
//        if (StringUtils.isBlank(this.getTradeType())) {
//            this.setTradeType(config.getTradeType());
//        }
//
//        super.checkAndSign(config);
//    }
//
//    public static WxPayUnifiedOrderRequest.WxPayUnifiedOrderRequestBuilder newBuilder() {
//        return new WxPayUnifiedOrderRequest.WxPayUnifiedOrderRequestBuilder();
//    }
//
//    public String getVersion() {
//        return this.version;
//    }
//
//    public String getDeviceInfo() {
//        return this.deviceInfo;
//    }
//
//    public String getBody() {
//        return this.body;
//    }
//
//    public String getDetail() {
//        return this.detail;
//    }
//
//    public String getAttach() {
//        return this.attach;
//    }
//
//    public String getOutTradeNo() {
//        return this.outTradeNo;
//    }
//
//    public String getFeeType() {
//        return this.feeType;
//    }
//
//    public Integer getTotalFee() {
//        return this.totalFee;
//    }
//
//    public String getSpbillCreateIp() {
//        return this.spbillCreateIp;
//    }
//
//    public String getTimeStart() {
//        return this.timeStart;
//    }
//
//    public String getTimeExpire() {
//        return this.timeExpire;
//    }
//
//    public String getGoodsTag() {
//        return this.goodsTag;
//    }
//
//    public String getNotifyUrl() {
//        return this.notifyUrl;
//    }
//
//    public String getTradeType() {
//        return this.tradeType;
//    }
//
//    public String getProductId() {
//        return this.productId;
//    }
//
//    public String getLimitPay() {
//        return this.limitPay;
//    }
//
//    public String getOpenid() {
//        return this.openid;
//    }
//
//    public String getSubOpenid() {
//        return this.subOpenid;
//    }
//
//    public String getReceipt() {
//        return this.receipt;
//    }
//
//    public String getSceneInfo() {
//        return this.sceneInfo;
//    }
//
//    public String getFingerprint() {
//        return this.fingerprint;
//    }
//
//    public void setVersion(String version) {
//        this.version = version;
//    }
//
//    public void setDeviceInfo(String deviceInfo) {
//        this.deviceInfo = deviceInfo;
//    }
//
//    public void setBody(String body) {
//        this.body = body;
//    }
//
//    public void setDetail(String detail) {
//        this.detail = detail;
//    }
//
//    public void setAttach(String attach) {
//        this.attach = attach;
//    }
//
//    public void setOutTradeNo(String outTradeNo) {
//        this.outTradeNo = outTradeNo;
//    }
//
//    public void setFeeType(String feeType) {
//        this.feeType = feeType;
//    }
//
//    public void setTotalFee(Integer totalFee) {
//        this.totalFee = totalFee;
//    }
//
//    public void setSpbillCreateIp(String spbillCreateIp) {
//        this.spbillCreateIp = spbillCreateIp;
//    }
//
//    public void setTimeStart(String timeStart) {
//        this.timeStart = timeStart;
//    }
//
//    public void setTimeExpire(String timeExpire) {
//        this.timeExpire = timeExpire;
//    }
//
//    public void setGoodsTag(String goodsTag) {
//        this.goodsTag = goodsTag;
//    }
//
//    public void setProductId(String productId) {
//        this.productId = productId;
//    }
//
//    public void setLimitPay(String limitPay) {
//        this.limitPay = limitPay;
//    }
//
//    public void setOpenid(String openid) {
//        this.openid = openid;
//    }
//
//    public void setSubOpenid(String subOpenid) {
//        this.subOpenid = subOpenid;
//    }
//
//    public void setReceipt(String receipt) {
//        this.receipt = receipt;
//    }
//
//    public void setSceneInfo(String sceneInfo) {
//        this.sceneInfo = sceneInfo;
//    }
//
//    public void setFingerprint(String fingerprint) {
//        this.fingerprint = fingerprint;
//    }
//
//    public String toString() {
//        return "WxPayUnifiedOrderRequest(version=" + this.getVersion() + ", deviceInfo=" + this.getDeviceInfo() + ", body=" + this.getBody() + ", detail=" + this.getDetail() + ", attach=" + this.getAttach() + ", outTradeNo=" + this.getOutTradeNo() + ", feeType=" + this.getFeeType() + ", totalFee=" + this.getTotalFee() + ", spbillCreateIp=" + this.getSpbillCreateIp() + ", timeStart=" + this.getTimeStart() + ", timeExpire=" + this.getTimeExpire() + ", goodsTag=" + this.getGoodsTag() + ", notifyUrl=" + this.getNotifyUrl() + ", tradeType=" + this.getTradeType() + ", productId=" + this.getProductId() + ", limitPay=" + this.getLimitPay() + ", openid=" + this.getOpenid() + ", subOpenid=" + this.getSubOpenid() + ", receipt=" + this.getReceipt() + ", sceneInfo=" + this.getSceneInfo() + ", fingerprint=" + this.getFingerprint() + ")";
//    }
//
//    public boolean equals(Object o) {
//        if (o == this) {
//            return true;
//        } else if (!(o instanceof WxPayUnifiedOrderRequest)) {
//            return false;
//        } else {
//            WxPayUnifiedOrderRequest other = (WxPayUnifiedOrderRequest)o;
//            if (!other.canEqual(this)) {
//                return false;
//            } else if (!super.equals(o)) {
//                return false;
//            } else {
//                label265: {
//                    Object this$version = this.getVersion();
//                    Object other$version = other.getVersion();
//                    if (this$version == null) {
//                        if (other$version == null) {
//                            break label265;
//                        }
//                    } else if (this$version.equals(other$version)) {
//                        break label265;
//                    }
//
//                    return false;
//                }
//
//                Object this$deviceInfo = this.getDeviceInfo();
//                Object other$deviceInfo = other.getDeviceInfo();
//                if (this$deviceInfo == null) {
//                    if (other$deviceInfo != null) {
//                        return false;
//                    }
//                } else if (!this$deviceInfo.equals(other$deviceInfo)) {
//                    return false;
//                }
//
//                label251: {
//                    Object this$body = this.getBody();
//                    Object other$body = other.getBody();
//                    if (this$body == null) {
//                        if (other$body == null) {
//                            break label251;
//                        }
//                    } else if (this$body.equals(other$body)) {
//                        break label251;
//                    }
//
//                    return false;
//                }
//
//                Object this$detail = this.getDetail();
//                Object other$detail = other.getDetail();
//                if (this$detail == null) {
//                    if (other$detail != null) {
//                        return false;
//                    }
//                } else if (!this$detail.equals(other$detail)) {
//                    return false;
//                }
//
//                Object this$attach = this.getAttach();
//                Object other$attach = other.getAttach();
//                if (this$attach == null) {
//                    if (other$attach != null) {
//                        return false;
//                    }
//                } else if (!this$attach.equals(other$attach)) {
//                    return false;
//                }
//
//                label230: {
//                    Object this$outTradeNo = this.getOutTradeNo();
//                    Object other$outTradeNo = other.getOutTradeNo();
//                    if (this$outTradeNo == null) {
//                        if (other$outTradeNo == null) {
//                            break label230;
//                        }
//                    } else if (this$outTradeNo.equals(other$outTradeNo)) {
//                        break label230;
//                    }
//
//                    return false;
//                }
//
//                label223: {
//                    Object this$feeType = this.getFeeType();
//                    Object other$feeType = other.getFeeType();
//                    if (this$feeType == null) {
//                        if (other$feeType == null) {
//                            break label223;
//                        }
//                    } else if (this$feeType.equals(other$feeType)) {
//                        break label223;
//                    }
//
//                    return false;
//                }
//
//                Object this$totalFee = this.getTotalFee();
//                Object other$totalFee = other.getTotalFee();
//                if (this$totalFee == null) {
//                    if (other$totalFee != null) {
//                        return false;
//                    }
//                } else if (!this$totalFee.equals(other$totalFee)) {
//                    return false;
//                }
//
//                Object this$spbillCreateIp = this.getSpbillCreateIp();
//                Object other$spbillCreateIp = other.getSpbillCreateIp();
//                if (this$spbillCreateIp == null) {
//                    if (other$spbillCreateIp != null) {
//                        return false;
//                    }
//                } else if (!this$spbillCreateIp.equals(other$spbillCreateIp)) {
//                    return false;
//                }
//
//                label202: {
//                    Object this$timeStart = this.getTimeStart();
//                    Object other$timeStart = other.getTimeStart();
//                    if (this$timeStart == null) {
//                        if (other$timeStart == null) {
//                            break label202;
//                        }
//                    } else if (this$timeStart.equals(other$timeStart)) {
//                        break label202;
//                    }
//
//                    return false;
//                }
//
//                label195: {
//                    Object this$timeExpire = this.getTimeExpire();
//                    Object other$timeExpire = other.getTimeExpire();
//                    if (this$timeExpire == null) {
//                        if (other$timeExpire == null) {
//                            break label195;
//                        }
//                    } else if (this$timeExpire.equals(other$timeExpire)) {
//                        break label195;
//                    }
//
//                    return false;
//                }
//
//                Object this$goodsTag = this.getGoodsTag();
//                Object other$goodsTag = other.getGoodsTag();
//                if (this$goodsTag == null) {
//                    if (other$goodsTag != null) {
//                        return false;
//                    }
//                } else if (!this$goodsTag.equals(other$goodsTag)) {
//                    return false;
//                }
//
//                Object this$notifyUrl = this.getNotifyUrl();
//                Object other$notifyUrl = other.getNotifyUrl();
//                if (this$notifyUrl == null) {
//                    if (other$notifyUrl != null) {
//                        return false;
//                    }
//                } else if (!this$notifyUrl.equals(other$notifyUrl)) {
//                    return false;
//                }
//
//                label174: {
//                    Object this$tradeType = this.getTradeType();
//                    Object other$tradeType = other.getTradeType();
//                    if (this$tradeType == null) {
//                        if (other$tradeType == null) {
//                            break label174;
//                        }
//                    } else if (this$tradeType.equals(other$tradeType)) {
//                        break label174;
//                    }
//
//                    return false;
//                }
//
//                label167: {
//                    Object this$productId = this.getProductId();
//                    Object other$productId = other.getProductId();
//                    if (this$productId == null) {
//                        if (other$productId == null) {
//                            break label167;
//                        }
//                    } else if (this$productId.equals(other$productId)) {
//                        break label167;
//                    }
//
//                    return false;
//                }
//
//                Object this$limitPay = this.getLimitPay();
//                Object other$limitPay = other.getLimitPay();
//                if (this$limitPay == null) {
//                    if (other$limitPay != null) {
//                        return false;
//                    }
//                } else if (!this$limitPay.equals(other$limitPay)) {
//                    return false;
//                }
//
//                label153: {
//                    Object this$openid = this.getOpenid();
//                    Object other$openid = other.getOpenid();
//                    if (this$openid == null) {
//                        if (other$openid == null) {
//                            break label153;
//                        }
//                    } else if (this$openid.equals(other$openid)) {
//                        break label153;
//                    }
//
//                    return false;
//                }
//
//                Object this$subOpenid = this.getSubOpenid();
//                Object other$subOpenid = other.getSubOpenid();
//                if (this$subOpenid == null) {
//                    if (other$subOpenid != null) {
//                        return false;
//                    }
//                } else if (!this$subOpenid.equals(other$subOpenid)) {
//                    return false;
//                }
//
//                label139: {
//                    Object this$receipt = this.getReceipt();
//                    Object other$receipt = other.getReceipt();
//                    if (this$receipt == null) {
//                        if (other$receipt == null) {
//                            break label139;
//                        }
//                    } else if (this$receipt.equals(other$receipt)) {
//                        break label139;
//                    }
//
//                    return false;
//                }
//
//                Object this$sceneInfo = this.getSceneInfo();
//                Object other$sceneInfo = other.getSceneInfo();
//                if (this$sceneInfo == null) {
//                    if (other$sceneInfo != null) {
//                        return false;
//                    }
//                } else if (!this$sceneInfo.equals(other$sceneInfo)) {
//                    return false;
//                }
//
//                Object this$fingerprint = this.getFingerprint();
//                Object other$fingerprint = other.getFingerprint();
//                if (this$fingerprint == null) {
//                    if (other$fingerprint != null) {
//                        return false;
//                    }
//                } else if (!this$fingerprint.equals(other$fingerprint)) {
//                    return false;
//                }
//
//                return true;
//            }
//        }
//    }
//
//    protected boolean canEqual(Object other) {
//        return other instanceof WxPayUnifiedOrderRequest;
//    }
//
//    public int hashCode() {
//        int PRIME = true;
//        int result = 1;
//        int result = result * 59 + super.hashCode();
//        Object $version = this.getVersion();
//        result = result * 59 + ($version == null ? 43 : $version.hashCode());
//        Object $deviceInfo = this.getDeviceInfo();
//        result = result * 59 + ($deviceInfo == null ? 43 : $deviceInfo.hashCode());
//        Object $body = this.getBody();
//        result = result * 59 + ($body == null ? 43 : $body.hashCode());
//        Object $detail = this.getDetail();
//        result = result * 59 + ($detail == null ? 43 : $detail.hashCode());
//        Object $attach = this.getAttach();
//        result = result * 59 + ($attach == null ? 43 : $attach.hashCode());
//        Object $outTradeNo = this.getOutTradeNo();
//        result = result * 59 + ($outTradeNo == null ? 43 : $outTradeNo.hashCode());
//        Object $feeType = this.getFeeType();
//        result = result * 59 + ($feeType == null ? 43 : $feeType.hashCode());
//        Object $totalFee = this.getTotalFee();
//        result = result * 59 + ($totalFee == null ? 43 : $totalFee.hashCode());
//        Object $spbillCreateIp = this.getSpbillCreateIp();
//        result = result * 59 + ($spbillCreateIp == null ? 43 : $spbillCreateIp.hashCode());
//        Object $timeStart = this.getTimeStart();
//        result = result * 59 + ($timeStart == null ? 43 : $timeStart.hashCode());
//        Object $timeExpire = this.getTimeExpire();
//        result = result * 59 + ($timeExpire == null ? 43 : $timeExpire.hashCode());
//        Object $goodsTag = this.getGoodsTag();
//        result = result * 59 + ($goodsTag == null ? 43 : $goodsTag.hashCode());
//        Object $notifyUrl = this.getNotifyUrl();
//        result = result * 59 + ($notifyUrl == null ? 43 : $notifyUrl.hashCode());
//        Object $tradeType = this.getTradeType();
//        result = result * 59 + ($tradeType == null ? 43 : $tradeType.hashCode());
//        Object $productId = this.getProductId();
//        result = result * 59 + ($productId == null ? 43 : $productId.hashCode());
//        Object $limitPay = this.getLimitPay();
//        result = result * 59 + ($limitPay == null ? 43 : $limitPay.hashCode());
//        Object $openid = this.getOpenid();
//        result = result * 59 + ($openid == null ? 43 : $openid.hashCode());
//        Object $subOpenid = this.getSubOpenid();
//        result = result * 59 + ($subOpenid == null ? 43 : $subOpenid.hashCode());
//        Object $receipt = this.getReceipt();
//        result = result * 59 + ($receipt == null ? 43 : $receipt.hashCode());
//        Object $sceneInfo = this.getSceneInfo();
//        result = result * 59 + ($sceneInfo == null ? 43 : $sceneInfo.hashCode());
//        Object $fingerprint = this.getFingerprint();
//        result = result * 59 + ($fingerprint == null ? 43 : $fingerprint.hashCode());
//        return result;
//    }
//
//    public WxPayUnifiedOrderRequest() {
//    }
//
//    @ConstructorProperties({"version", "deviceInfo", "body", "detail", "attach", "outTradeNo", "feeType", "totalFee", "spbillCreateIp", "timeStart", "timeExpire", "goodsTag", "notifyUrl", "tradeType", "productId", "limitPay", "openid", "subOpenid", "receipt", "sceneInfo", "fingerprint"})
//    public WxPayUnifiedOrderRequest(String version, String deviceInfo, String body, String detail, String attach, String outTradeNo, String feeType, Integer totalFee, String spbillCreateIp, String timeStart, String timeExpire, String goodsTag, String notifyUrl, String tradeType, String productId, String limitPay, String openid, String subOpenid, String receipt, String sceneInfo, String fingerprint) {
//        this.version = version;
//        this.deviceInfo = deviceInfo;
//        this.body = body;
//        this.detail = detail;
//        this.attach = attach;
//        this.outTradeNo = outTradeNo;
//        this.feeType = feeType;
//        this.totalFee = totalFee;
//        this.spbillCreateIp = spbillCreateIp;
//        this.timeStart = timeStart;
//        this.timeExpire = timeExpire;
//        this.goodsTag = goodsTag;
//        this.notifyUrl = notifyUrl;
//        this.tradeType = tradeType;
//        this.productId = productId;
//        this.limitPay = limitPay;
//        this.openid = openid;
//        this.subOpenid = subOpenid;
//        this.receipt = receipt;
//        this.sceneInfo = sceneInfo;
//        this.fingerprint = fingerprint;
//    }
//
//    public static class WxPayUnifiedOrderRequestBuilder {
//        private String version;
//        private String deviceInfo;
//        private String body;
//        private String detail;
//        private String attach;
//        private String outTradeNo;
//        private String feeType;
//        private Integer totalFee;
//        private String spbillCreateIp;
//        private String timeStart;
//        private String timeExpire;
//        private String goodsTag;
//        private String notifyUrl;
//        private String tradeType;
//        private String productId;
//        private String limitPay;
//        private String openid;
//        private String subOpenid;
//        private String receipt;
//        private String sceneInfo;
//        private String fingerprint;
//
//        WxPayUnifiedOrderRequestBuilder() {
//        }
//
//        public WxPayUnifiedOrderRequest.WxPayUnifiedOrderRequestBuilder version(String version) {
//            this.version = version;
//            return this;
//        }
//
//        public WxPayUnifiedOrderRequest.WxPayUnifiedOrderRequestBuilder deviceInfo(String deviceInfo) {
//            this.deviceInfo = deviceInfo;
//            return this;
//        }
//
//        public WxPayUnifiedOrderRequest.WxPayUnifiedOrderRequestBuilder body(String body) {
//            this.body = body;
//            return this;
//        }
//
//        public WxPayUnifiedOrderRequest.WxPayUnifiedOrderRequestBuilder detail(String detail) {
//            this.detail = detail;
//            return this;
//        }
//
//        public WxPayUnifiedOrderRequest.WxPayUnifiedOrderRequestBuilder attach(String attach) {
//            this.attach = attach;
//            return this;
//        }
//
//        public WxPayUnifiedOrderRequest.WxPayUnifiedOrderRequestBuilder outTradeNo(String outTradeNo) {
//            this.outTradeNo = outTradeNo;
//            return this;
//        }
//
//        public WxPayUnifiedOrderRequest.WxPayUnifiedOrderRequestBuilder feeType(String feeType) {
//            this.feeType = feeType;
//            return this;
//        }
//
//        public WxPayUnifiedOrderRequest.WxPayUnifiedOrderRequestBuilder totalFee(Integer totalFee) {
//            this.totalFee = totalFee;
//            return this;
//        }
//
//        public WxPayUnifiedOrderRequest.WxPayUnifiedOrderRequestBuilder spbillCreateIp(String spbillCreateIp) {
//            this.spbillCreateIp = spbillCreateIp;
//            return this;
//        }
//
//        public WxPayUnifiedOrderRequest.WxPayUnifiedOrderRequestBuilder timeStart(String timeStart) {
//            this.timeStart = timeStart;
//            return this;
//        }
//
//        public WxPayUnifiedOrderRequest.WxPayUnifiedOrderRequestBuilder timeExpire(String timeExpire) {
//            this.timeExpire = timeExpire;
//            return this;
//        }
//
//        public WxPayUnifiedOrderRequest.WxPayUnifiedOrderRequestBuilder goodsTag(String goodsTag) {
//            this.goodsTag = goodsTag;
//            return this;
//        }
//
//        public WxPayUnifiedOrderRequest.WxPayUnifiedOrderRequestBuilder notifyUrl(String notifyUrl) {
//            this.notifyUrl = notifyUrl;
//            return this;
//        }
//
//        public WxPayUnifiedOrderRequest.WxPayUnifiedOrderRequestBuilder tradeType(String tradeType) {
//            this.tradeType = tradeType;
//            return this;
//        }
//
//        public WxPayUnifiedOrderRequest.WxPayUnifiedOrderRequestBuilder productId(String productId) {
//            this.productId = productId;
//            return this;
//        }
//
//        public WxPayUnifiedOrderRequest.WxPayUnifiedOrderRequestBuilder limitPay(String limitPay) {
//            this.limitPay = limitPay;
//            return this;
//        }
//
//        public WxPayUnifiedOrderRequest.WxPayUnifiedOrderRequestBuilder openid(String openid) {
//            this.openid = openid;
//            return this;
//        }
//
//        public WxPayUnifiedOrderRequest.WxPayUnifiedOrderRequestBuilder subOpenid(String subOpenid) {
//            this.subOpenid = subOpenid;
//            return this;
//        }
//
//        public WxPayUnifiedOrderRequest.WxPayUnifiedOrderRequestBuilder receipt(String receipt) {
//            this.receipt = receipt;
//            return this;
//        }
//
//        public WxPayUnifiedOrderRequest.WxPayUnifiedOrderRequestBuilder sceneInfo(String sceneInfo) {
//            this.sceneInfo = sceneInfo;
//            return this;
//        }
//
//        public WxPayUnifiedOrderRequest.WxPayUnifiedOrderRequestBuilder fingerprint(String fingerprint) {
//            this.fingerprint = fingerprint;
//            return this;
//        }
//
//        public WxPayUnifiedOrderRequest build() {
//            return new WxPayUnifiedOrderRequest(this.version, this.deviceInfo, this.body, this.detail, this.attach, this.outTradeNo, this.feeType, this.totalFee, this.spbillCreateIp, this.timeStart, this.timeExpire, this.goodsTag, this.notifyUrl, this.tradeType, this.productId, this.limitPay, this.openid, this.subOpenid, this.receipt, this.sceneInfo, this.fingerprint);
//        }
//
//        public String toString() {
//            return "WxPayUnifiedOrderRequest.WxPayUnifiedOrderRequestBuilder(version=" + this.version + ", deviceInfo=" + this.deviceInfo + ", body=" + this.body + ", detail=" + this.detail + ", attach=" + this.attach + ", outTradeNo=" + this.outTradeNo + ", feeType=" + this.feeType + ", totalFee=" + this.totalFee + ", spbillCreateIp=" + this.spbillCreateIp + ", timeStart=" + this.timeStart + ", timeExpire=" + this.timeExpire + ", goodsTag=" + this.goodsTag + ", notifyUrl=" + this.notifyUrl + ", tradeType=" + this.tradeType + ", productId=" + this.productId + ", limitPay=" + this.limitPay + ", openid=" + this.openid + ", subOpenid=" + this.subOpenid + ", receipt=" + this.receipt + ", sceneInfo=" + this.sceneInfo + ", fingerprint=" + this.fingerprint + ")";
//        }
//    }
//}
