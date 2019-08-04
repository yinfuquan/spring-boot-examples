package com.yin.springboot.mybatis.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

@Data
public class UmsMemberTag implements Serializable {
    private Long id;

    private String name;

    /**
    * 自动打标签完成订单数量
    */
    private Integer finishOrderCount;

    /**
    * 自动打标签完成订单金额
    */
    private BigDecimal finishOrderAmount;

    private static final long serialVersionUID = 1L;
}