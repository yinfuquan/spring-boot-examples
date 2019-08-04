package com.yin.springboot.mybatis.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class SmsHomeAdvertise implements Serializable {
    private Long id;

    private String name;

    /**
    * 轮播位置：0->PC首页轮播；1->app首页轮播
    */
    private Integer type;

    private String pic;

    private Date startTime;

    private Date endTime;

    /**
    * 上下线状态：0->下线；1->上线
    */
    private Integer status;

    /**
    * 点击数
    */
    private Integer clickCount;

    /**
    * 下单数
    */
    private Integer orderCount;

    /**
    * 链接地址
    */
    private String url;

    /**
    * 备注
    */
    private String note;

    /**
    * 排序
    */
    private Integer sort;

    private static final long serialVersionUID = 1L;
}