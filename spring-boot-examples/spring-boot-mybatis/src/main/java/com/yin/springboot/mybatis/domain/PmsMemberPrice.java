package com.yin.springboot.mybatis.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

@Data
public class PmsMemberPrice implements Serializable {
    private Long id;

    private Long productId;

    private Long memberLevelId;

    /**
    * 会员价格
    */
    private BigDecimal memberPrice;

    private String memberLevelName;

    private static final long serialVersionUID = 1L;
}