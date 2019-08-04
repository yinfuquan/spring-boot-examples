package com.yin.springboot.mybatis.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

@Data
public class PmsFeightTemplate implements Serializable {
    private Long id;

    private String name;

    /**
    * 计费类型:0->按重量；1->按件数
    */
    private Integer chargeType;

    /**
    * 首重kg
    */
    private BigDecimal firstWeight;

    /**
    * 首费（元）
    */
    private BigDecimal firstFee;

    private BigDecimal continueWeight;

    private BigDecimal continmeFee;

    /**
    * 目的地（省、市）
    */
    private String dest;

    private static final long serialVersionUID = 1L;
}