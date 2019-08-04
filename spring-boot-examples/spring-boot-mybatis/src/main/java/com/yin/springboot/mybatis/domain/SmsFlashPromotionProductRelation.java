package com.yin.springboot.mybatis.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

@Data
public class SmsFlashPromotionProductRelation implements Serializable {
    /**
    * 编号
    */
    private Long id;

    private Long flashPromotionId;

    /**
    * 编号
    */
    private Long flashPromotionSessionId;

    private Long productId;

    /**
    * 限时购价格
    */
    private BigDecimal flashPromotionPrice;

    /**
    * 限时购数量
    */
    private Integer flashPromotionCount;

    /**
    * 每人限购数量
    */
    private Integer flashPromotionLimit;

    /**
    * 排序
    */
    private Integer sort;

    private static final long serialVersionUID = 1L;
}