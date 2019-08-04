package com.yin.springboot.mybatis.domain;

import java.io.Serializable;
import lombok.Data;

@Data
public class SmsCouponProductRelation implements Serializable {
    private Long id;

    private Long couponId;

    private Long productId;

    /**
    * 商品名称
    */
    private String productName;

    /**
    * 商品编码
    */
    private String productSn;

    private static final long serialVersionUID = 1L;
}