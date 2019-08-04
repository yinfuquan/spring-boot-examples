package com.yin.springboot.mybatis.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

@Data
public class PmsProductLadder implements Serializable {
    private Long id;

    private Long productId;

    /**
    * 满足的商品数量
    */
    private Integer count;

    /**
    * 折扣
    */
    private BigDecimal discount;

    /**
    * 折后价格
    */
    private BigDecimal price;

    private static final long serialVersionUID = 1L;
}