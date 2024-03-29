package com.yin.springboot.mybatis.domain;

import java.io.Serializable;
import lombok.Data;

@Data
public class OmsOrderSetting implements Serializable {
    private Long id;

    /**
    * 秒杀订单超时关闭时间(分)
    */
    private Integer flashOrderOvertime;

    /**
    * 正常订单超时时间(分)
    */
    private Integer normalOrderOvertime;

    /**
    * 发货后自动确认收货时间（天）
    */
    private Integer confirmOvertime;

    /**
    * 自动完成交易时间，不能申请售后（天）
    */
    private Integer finishOvertime;

    /**
    * 订单完成后自动好评时间（天）
    */
    private Integer commentOvertime;

    private static final long serialVersionUID = 1L;
}