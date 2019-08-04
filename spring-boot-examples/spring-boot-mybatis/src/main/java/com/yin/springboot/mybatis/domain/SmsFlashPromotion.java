package com.yin.springboot.mybatis.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class SmsFlashPromotion implements Serializable {
    private Long id;

    private String title;

    /**
    * 开始日期
    */
    private Date startDate;

    /**
    * 结束日期
    */
    private Date endDate;

    /**
    * 上下线状态
    */
    private Integer status;

    /**
    * 秒杀时间段名称
    */
    private Date createTime;

    private static final long serialVersionUID = 1L;
}