package com.yin.springboot.mybatis.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class SmsFlashPromotionLog implements Serializable {
    private Integer id;

    private Integer memberId;

    private Long productId;

    private String memberPhone;

    private String productName;

    /**
    * 会员订阅时间
    */
    private Date subscribeTime;

    private Date sendTime;

    private static final long serialVersionUID = 1L;
}