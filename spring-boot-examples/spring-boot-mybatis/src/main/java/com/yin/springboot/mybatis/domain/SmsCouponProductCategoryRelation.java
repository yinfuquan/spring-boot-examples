package com.yin.springboot.mybatis.domain;

import java.io.Serializable;
import lombok.Data;

@Data
public class SmsCouponProductCategoryRelation implements Serializable {
    private Long id;

    private Long couponId;

    private Long productCategoryId;

    /**
    * 产品分类名称
    */
    private String productCategoryName;

    /**
    * 父分类名称
    */
    private String parentCategoryName;

    private static final long serialVersionUID = 1L;
}