package com.yin.springboot.mybatis.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

@Data
public class PmsProductFullReduction implements Serializable {
    private Long id;

    private Long productId;

    private BigDecimal fullPrice;

    private BigDecimal reducePrice;

    private static final long serialVersionUID = 1L;
}