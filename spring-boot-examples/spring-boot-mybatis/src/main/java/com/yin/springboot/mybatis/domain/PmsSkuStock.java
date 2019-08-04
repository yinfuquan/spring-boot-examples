package com.yin.springboot.mybatis.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

@Data
public class PmsSkuStock implements Serializable {
    private Long id;

    private Long productId;

    /**
    * sku编码
    */
    private String skuCode;

    private BigDecimal price;

    /**
    * 库存
    */
    private Integer stock;

    /**
    * 预警库存
    */
    private Integer lowStock;

    /**
    * 销售属性1
    */
    private String sp1;

    private String sp2;

    private String sp3;

    /**
    * 展示图片
    */
    private String pic;

    /**
    * 销量
    */
    private Integer sale;

    /**
    * 单品促销价格
    */
    private BigDecimal promotionPrice;

    /**
    * 锁定库存
    */
    private Integer lockStock;

    private static final long serialVersionUID = 1L;
}